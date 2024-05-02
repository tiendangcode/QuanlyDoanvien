package vn.viettuts.qlsv.dao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;

import vn.viettuts.qlsv.entity.Doanvien;
import vn.viettuts.qlsv.entity.StudentXML;
import vn.viettuts.qlsv.utils.FileUtils;

/**
 * DoanvienDao class
 * 
 * @author viettuts.vn
 */

public class DoanvienDao {
    private static final String STUDENT_FILE_NAME = "student.xml";
    private List<Doanvien> listStudents;

    public DoanvienDao() {
        this.listStudents = readListStudents();
        if (listStudents == null) {
            listStudents = new ArrayList<Doanvien>();
        }
    }
 
    /**
     * Lưu các đối tượng student vào file student.xml
     * 
     * @param students
     */
    public void writeListStudents(List<Doanvien> students) {
        StudentXML studentXML = new StudentXML();
        studentXML.setStudent(students);
        FileUtils.writeXMLtoFile(STUDENT_FILE_NAME, studentXML);
    }

    /**
     * Đọc các đối tượng student từ file student.xml
     * 
     * @return list student
     */
    public List<Doanvien> readListStudents() {
        List<Doanvien> list = new ArrayList<Doanvien>();
        StudentXML studentXML = (StudentXML) FileUtils.readXMLFile(
                STUDENT_FILE_NAME, StudentXML.class);
        if (studentXML != null) {
            list = studentXML.getStudent();
        }
        return list;
    }
    

    /**
     * thêm student vào listStudents và lưu listStudents vào file
     * 
     * @param student
     */
     // thêm student vào listStudents và lưu listStudents vào file
    public void addnhanvien(Doanvien nhanvien) {
        listStudents.add(nhanvien);
        writeListStudents(listStudents);
    }
  //thêm pharmed vào listPharMeds và lưu listPharMeds vào file
        public void add(Doanvien student){
        listStudents.add(student);
        writeListStudents(listStudents);
        }
    /**
     * cập nhật student vào listStudents và lưu listStudents vào file
     * 
     * @param student
     */
    public void editid(Doanvien student) {
        int size = listStudents.size();
        for (int i = 0; i < size; i++) {
            if (listStudents.get(i).getId().equals(student.getId())) {
                listStudents.get(i).setName(student.getName());
                listStudents.get(i).setAge(student.getAge());
                listStudents.get(i).setSex(student.getSex());
                listStudents.get(i).setAddress(student.getAddress());
                listStudents.get(i).setLop(student.getLop());
                listStudents.get(i).setGpa(student.getGpa());
                listStudents.get(i).setDrl(student.getDrl());
                listStudents.get(i).setDoanphi(student.getDoanphi());
                listStudents.get(i).setDangphi(student.getDangphi());
                listStudents.get(i).setNvd(student.getNvd());
                listStudents.get(i).setChibo(student.getChibo());
                listStudents.get(i).setTinhtrang(student.getTinhtrang());
                
                writeListStudents(listStudents);
                break;
            }
        }
    }

    /**
     * xóa student từ listStudents và lưu listStudents vào file
     * 
     * @param student
     */
    public boolean deleteid(Doanvien student) {
        boolean isFound = false;
        int size = listStudents.size();
        for (int i = 0; i < size; i++) {
            if (listStudents.get(i).getId() == student.getId()) {
                student = listStudents.get(i);
                isFound = true;
                break;
            }
        }
        if (isFound) {
            listStudents.remove(student);
            writeListStudents(listStudents);
            return true;
        }
        return false;
    }

    
     public void Tuyennhanvien(Doanvien nhanvien) {
       String tinhtrang = "Đảng Viên";
       int size = listStudents.size();
        for (int i = 0; i < size; i++) {
            if (listStudents.get(i).getName().equalsIgnoreCase(nhanvien.getName())) {
                listStudents.get(i).setId(nhanvien.getId());
                listStudents.get(i).setTinhtrang(tinhtrang);
                writeListStudents(listStudents);
                break;
            }
        }
    }
    /**
     * sắp xếp danh sách student theo name theo tứ tự tăng dần
     */
    public void sortStudentByName() {
        Collections.sort(listStudents, new Comparator<Doanvien>() {
            public int compare(Doanvien student1, Doanvien student2) {
                return student1.getName().compareTo(student2.getName());
            }
        });
    }
   
        
     //sắp xếp theo Quê quán
        public void sortStudentsByAddress(){
            Collections.sort(listStudents, new Comparator<Doanvien>(){
                @Override
                public int compare(Doanvien student1, Doanvien student2) {
                    return student1.getAddress().compareTo(student2.getAddress());
}
            });
        }

    
         public List<Doanvien> searchtuyendung(String tinhtrang) {
        List<Doanvien> result = new ArrayList<>();
        for (Doanvien nhanvien : listStudents) {
            if (nhanvien.getDoanphi().equals(tinhtrang)) {
                result.add(nhanvien);
            }
        }
        return result;
    }
//tìm kiếm gần đúng theo Quê quán
        public List<Doanvien> searchByAddress(String addr){
            List<Doanvien> list = new ArrayList<>();
            
            for(Doanvien pharMed : listStudents){
                if(pharMed.getAddress().toLowerCase().contains(addr))
                    list.add(pharMed);
            }
            return list;
        }
    public List<Doanvien> getListStudents() {
        return listStudents;
    }

    public void setListStudents(List<Doanvien> listStudents) {
        this.listStudents = listStudents;
    }

 
    

    // cập nhật student vào listStudents và lưu listStudents vào file
    // cập nhật theo id
   

   
   
    // xóa nhan vien theo id từ listStudents và lưu listStudents vào file
    public boolean deletename(Doanvien nhanvien) {
        boolean isFound = false;

        for (int i = 0; i < listStudents.size(); i++) {
            if (listStudents.get(i).getName().equalsIgnoreCase(nhanvien.getName())) {
                nhanvien = listStudents.get(i);
                isFound = true;
                break;
            }
        }
        if (isFound) {
            listStudents.remove(nhanvien);
            writeListStudents(listStudents);
            return true;
        }
        return false;
    }

    // sắp xếp danh sách nhan viem theo name theo tứ tự tăng dần
    public void sortNhanvienByName() {
        Collections.sort(listStudents, new Comparator<Doanvien>() {
            public int compare(Doanvien nhanvien1, Doanvien nhanvien2) {
                return nhanvien1.getName().compareTo(nhanvien2.getName());
            }
        });
    }
/*
    // sap sep danh sach nhan vien theo luong tang dan
    public void sortNhanvienByLuong() {
        Collections.sort(listStudents, new Comparator<Nhanvien>() {
            public int compare(Nhanvien student1, Nhanvien student2) {
                if (student1.getLuong() > student2.getLuong()) {
                    return 1;
                }
                return -1;
            }
        });
    }
*/
    // sap sep danh sach nhan vien theo id tang dan
    public void sortStudentByID() {
        Collections.sort(listStudents, new Comparator<Doanvien>() {
            public int compare(Doanvien nhanvien1, Doanvien nhanvien2) {
                return nhanvien1.getId().compareTo(nhanvien2.getId());
            }
        });
    }

    public List<Doanvien> searchByName(String name) {
        List<Doanvien> result = new ArrayList<>();
        for (Doanvien nhanvien : listStudents) {
            if (nhanvien.getName().contains(name)) {
                result.add(nhanvien);
            }
        }
        return result;
    }

    // Tìm kiếm sinh viên theo ID
    public List<Doanvien> searchByID(String id) {
        List<Doanvien> result = new ArrayList<>();
        for (Doanvien nhanvien : listStudents) {
            if (String.valueOf(nhanvien.getId()).contains(id)) {
                result.add(nhanvien);
            }
        }
        return result;
    }

  


}

       
