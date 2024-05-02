package vn.viettuts.qlsv.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.List;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import vn.viettuts.qlsv.dao.DoanvienDao;
import vn.viettuts.qlsv.entity.Doanvien;
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.xml.bind.JAXBException;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import vn.viettuts.qlsv.dao.PhongbanDao;
import vn.viettuts.qlsv.entity.Phongban;
import vn.viettuts.qlsv.view.AddFrame;
import vn.viettuts.qlsv.view.Trangchu;

public class StudentController {

    private Trangchu mainview;
    private DoanvienDao nhanviendao;
    private PhongbanDao phongbandao;
    public StudentController(Trangchu mainview) {
        this.mainview = mainview;
        nhanviendao = new DoanvienDao();
        phongbandao = new PhongbanDao(nhanviendao.getListStudents());
        mainview.addButtonXoaListener(new DeleteNhanvienListener());
        mainview.addButtonClearListener(new ClearNhanvienListener());
        mainview.addButtonTimkiemListener(new SearchNhanvienListener());
        mainview.addButtonsapxeptheotenListener(new SortNhanvienNameListener());
        mainview.addButtonsapxeptheoIDListener(new SortNhanvienIDListener());
        mainview.addListNhanvienListener(new ListNhanvienListener());
        mainview.addButtonSuaListener(new SuaNhanvienListener());
        mainview.addButtonThemNhanvienListener(new AddNhanvienListener());
        mainview.addSortbyTenphongListener(new SortPhongbanbyNameListener());
       mainview.addSortbyTongnLuongListener(new SortPhongbanbyLuongListener());
        
        mainview.addButtonTimkiemtuyendungListener(new SearchTuyendungListener());
        mainview.addButtonCleartuyendungListener(new ClearTuyendungListener());
        mainview.addButtonxoatuyendungListener(new DeleteTuyendungListener());
        mainview.addListTuyendungListener(new ListTuyendungListener());
       // mainview.addButtonTuyendungnhanvienListener(new TuyendungListener());

    }
    
  
    
    class SortPhongbanbyNameListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            phongbandao.sortByTen();
            mainview.showtablephongban(phongbandao.getListphongban());
        }
    }

    class SortPhongbanbyLuongListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            phongbandao.sortByTongluong();
            mainview.showtablephongban(phongbandao.getListphongban());
        }
    }
    // show màn hình 
    public void showNhanvienView() {
        List<Doanvien> nhanvienList = nhanviendao.getListStudents();
        mainview.setVisible(true);
        mainview.showtableNhanvien(nhanvienList);
        List<Phongban> phongbanlist = phongbandao.getListphongban();
        mainview.showtablephongban(phongbanlist);
        mainview.showtableTuyennhanvien(nhanvienList);
        mainview.showbieudocotphongban(phongbanlist);
         mainview.showtableKhenthuong(nhanvienList);
    }

    class AddNhanvienListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            AddFrame addview = new AddFrame();
            addview.setVisible(true);
            ButtonLuuListener buttonLuuListener = new ButtonLuuListener(addview);
            addview.addThemNhanvienListener(buttonLuuListener);

        }
    }

    // tao class add nhan vien 
    class ButtonLuuListener implements ActionListener {

        private AddFrame addview;

        public ButtonLuuListener(AddFrame addview) {
            this.addview = addview;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Doanvien nhanvien = addview.getNhanvienInfo();
            if (nhanvien != null) {
                nhanviendao.addnhanvien(nhanvien);
                
                mainview.showNhanvien(nhanvien);
                mainview.showtableNhanvien(nhanviendao.getListStudents());
                mainview.showtableTuyennhanvien(nhanviendao.getListStudents());
                mainview.showMessage("Thêm thành công!");
                addview.setVisible(false);
            }
        }
    }

    // sửa thông tin nhân viên 
    class SuaNhanvienListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Doanvien nhanvien = mainview.getNhanvienInfo();
            if (nhanvien != null) {
                for(Doanvien x : nhanviendao.getListStudents()){
                    if(nhanvien.getId().equals(x.getId())){
                        nhanvien.setTinhtrang(x.getTinhtrang());
                       // nhanvien.setTrinhdo(x.getTrinhdo());
                    }
                }
                nhanviendao.editid(nhanvien);
                
                mainview.showNhanvien(nhanvien);
                mainview.showtableNhanvien(nhanviendao.getListStudents());
                mainview.showMessage("Sửa thành công!");

            }
        }
    }

    // xóa nhân viene
    class DeleteNhanvienListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Doanvien nhanvien = mainview.getNhanvienInfo();
            if (nhanvien != null) {
                nhanviendao.deleteid(nhanvien);
                mainview.ClearNhanvien();
                mainview.showMessage("Xóa thành công!");
           }
            mainview.showtableNhanvien(nhanviendao.getListStudents());
            phongbandao = new PhongbanDao(nhanviendao.getListStudents());
        }
    }

    class DeleteTuyendungListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Doanvien nhanvien = mainview.getTuyendungInfo();
            if (nhanvien != null) {
                nhanviendao.deletename(nhanvien);
                mainview.ClearTuyendung();
                mainview.showMessage("Xóa thành công!");
           }
            mainview.showtableTuyennhanvien(nhanviendao.getListStudents());
            phongbandao = new PhongbanDao(nhanviendao.getListStudents());
        }
    }

    // clear nhan nhan vien
    class ClearNhanvienListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            mainview.ClearNhanvien();
        }
    }

    // clear tuyendung
    class ClearTuyendungListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            mainview.ClearTuyendung();
        }
    }

    // sắp xếp theo name
    class SortNhanvienNameListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            nhanviendao.sortNhanvienByName();
            mainview.showtableNhanvien(nhanviendao.getListStudents());
        }
    }

    // sắp xếp theo ID
    class SortNhanvienIDListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            nhanviendao.sortStudentByID();
            mainview.showtableNhanvien(nhanviendao.getListStudents());
        }
    }

    // hàm tìm kiếm nhân vien tạm thời
    class SearchTuyendungListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            List<Doanvien> temp = new ArrayList<>();
            int check = mainview.loaiSearchtuyendung();

            if (check == 1) {
                String search = mainview.thongtinetuyendungSearch();
                // Tìm kiếm theo tên              
                temp = nhanviendao.searchByName(search);
            } else if (check == 2) {
                // tìm kiếm theo chưa tuyển dụng
                temp = nhanviendao.searchtuyendung("Chưa đóng");
            } else if (check == 3) {
                // tìm kiếm theo đã tuyển dụng
                temp = nhanviendao.searchtuyendung("Đã đóng");
            }
            if (!temp.isEmpty()) {
                mainview.showtableTuyennhanvien(temp);
            } else {
                mainview.showMessage("Không tìm thấy kết quả!");
            }
        }
    }

    class SearchNhanvienListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            List<Doanvien> temp = new ArrayList<>();
            int check = mainview.loaiSearch();
            String search = mainview.thongtineSearch();
            if (check == 1) {
                // Tìm kiếm theo tên              
                temp = nhanviendao.searchByName(search);
            } else if (check == 2) {
                // Tìm kiếm theo giá
                temp = nhanviendao.searchByID(search);
            }
            if (!temp.isEmpty()) {
                mainview.showtableNhanvien(temp);
            } else {
                mainview.showMessage("Không tìm thấy kết quả!");
            }
        }
    }

    class TuyendungListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Doanvien nhanvien = mainview.getTuyendungInfo();
            if (mainview.Checktuyendung()) {
                nhanviendao.Tuyennhanvien(nhanvien);
                mainview.showtableTuyennhanvien(nhanviendao.getListStudents());
                mainview.showtableNhanvien(nhanviendao.getListStudents());
                mainview.showMessage("Chuyển thành công sang danh sách đảng viên!");
            } else {
                mainview.showMessage("Bạn cần nhập mã thẻ đảng viên nếu muốn thêm vào quản lý đảng viên");
            }

        }
    }

    class ListNhanvienListener implements ListSelectionListener {

        @Override
        public void valueChanged(ListSelectionEvent e) {
            try {
                mainview.showhangduocchon(nhanviendao.getListStudents());
            } catch (ParseException ex) {
                Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    class ListTuyendungListener implements ListSelectionListener {

        @Override
        public void valueChanged(ListSelectionEvent e) {
            try {
                mainview.showtuyenduocchon(nhanviendao.getListStudents());
            } catch (ParseException ex) {
                Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
  