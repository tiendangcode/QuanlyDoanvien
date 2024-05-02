package vn.viettuts.qlsv.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import vn.viettuts.qlsv.entity.Doanvien;
import vn.viettuts.qlsv.entity.Phongban;

public class PhongbanDao {

    private List<Phongban> listphongban;

    public PhongbanDao(List<Doanvien> listnhanvien) {
        listphongban = new ArrayList<>();
        List<Doanvien> tmp = new ArrayList();

        List<Doanvien> B1 = new ArrayList();
        List<Doanvien> B2 = new ArrayList();
        List<Doanvien> B3 = new ArrayList();
        List<Doanvien> B4 = new ArrayList();
        List<Doanvien> B5 = new ArrayList();

        for (Doanvien nhanvien : listnhanvien) {
            if (nhanvien.getLop().equals("B1D54")) {              
                    B1.add(nhanvien);}
            if (nhanvien.getLop().equals("B2D54")) {              
                    B2.add(nhanvien);}    
            if (nhanvien.getLop().equals("B3D54")) {              
                    B3.add(nhanvien);}
            if (nhanvien.getLop().equals("B4D54")) {              
                    B4.add(nhanvien);}
            if (nhanvien.getLop().equals("B5D54")) {              
                    B5.add(nhanvien);}
            
            }
        
      

        
        // Tạo các đối tượng Phongban từ danh sách nhân viên đã được phân chia
        Phongban phongban1 = new Phongban("Chi đoàn B1D54", B1);
        Phongban phongban2 = new Phongban("Chi đoàn B2D54", B2);
        Phongban phongban3 = new Phongban("Chi đoàn B3D54",  B3);
        Phongban phongban4 = new Phongban("Chi đoàn B4D54",  B4);
        Phongban phongban5 = new Phongban("Chi đoàn B5D54",  B5);
        // Thêm các đối tượng Phongban vào danh sách
        addPhongban(phongban1);
        addPhongban(phongban2);
        addPhongban(phongban3);
        addPhongban(phongban4);
        addPhongban(phongban5);
    }

    void addPhongban(Phongban phongban) {

        listphongban.add(phongban);
    }

    // Phương thức sắp xếp phòng ban theo tên
    public void sortByTen() {
        Collections.sort(listphongban, new Comparator<Phongban>() {
            public int compare(Phongban phongban1, Phongban phongban2) {
                return phongban1.getNamephongban().compareTo(phongban2.getNamephongban());
            }
        });
    }

    // Phương thức sắp xếp phòng ban theo tổng lương
    public void sortByTongluong() {
        Collections.sort(listphongban, new Comparator<Phongban>() {
            public int compare(Phongban phongban1, Phongban phongban2) {
                if (phongban1.getGpatb() > phongban2.getGpatb()) {
                    return 1;
                }
                return -1;
            }
        });
    }

    public List<Phongban> getListphongban() {
        return listphongban;
    }

}
