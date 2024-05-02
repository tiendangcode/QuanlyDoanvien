package vn.viettuts.qlsv.entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "student")
@XmlAccessorType(XmlAccessType.FIELD)
public class Doanvien implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String name;
    private String age;
    private String address;
    private String sex;
    private String lop;
    private double gpa;
    private String doanphi;
    private double drl;
    private String chibo,nvd,dangphi;
    private String tinhtrang;
    public Doanvien() {
    }

    public Doanvien(String id, String name, String age, String sex, String address, String lop, double gpa, double drl, String doanphi, String chibo, String nvd, String dangphi, String tinhtrang) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex=sex;
        this.address = address;
        this.lop = lop;
        this.doanphi = doanphi; 
        this.drl = drl;
        this.gpa = gpa;
        this.chibo = chibo;
        this.nvd = nvd;
        this.dangphi = dangphi;
        this.tinhtrang=tinhtrang;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    
     public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
   public double getGpa(){
       return gpa;
   }
    public void setGpa(double luong) {
        this.gpa = luong;
    }
    
    public double getDrl(){
       return drl;
   }
    public void setDrl(double drl) {
        this.drl = drl;
    }
    
     
    public String getDoanphi() {
        return doanphi;
    }

    public void setDoanphi(String dp) {
        this.doanphi = dp;
    }
    
     public String getChibo() {
        return chibo;
    }

    public void setChibo(String chibo) {
        this.chibo = chibo;
    }
    
     public String getDangphi() {
        return dangphi;
    }

    public void setDangphi(String id) {
        this.dangphi = id;
    }
    
     public String getNvd() {
        return nvd;
    }

    public void setNvd(String nvd) {
        this.nvd = nvd;
    }
//    public Object[] toArray(){
 //       return new Object[]{id,name,age,sex,address,lop};
 //   }
    
    public String getTinhtrang() {
        return tinhtrang;
    }
    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }
   
}
