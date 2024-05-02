package vn.viettuts.qlsv.entity;

import java.text.DecimalFormat;
import vn.viettuts.qlsv.entity.Doanvien;
import java.util.List;
import java.util.ArrayList;

public class Phongban {

    private String namephongban;
   
    private int tongnhanvien;
    private double tonggpa;
    private double gpatb;
    private double tongdrl;
    private double drltb;
    private List<Doanvien> listnhanvienphong;

     public Phongban() {
        this.listnhanvienphong = new ArrayList<>();
        this.tonggpa = 0; // Khởi tạo tổng lương
        this.tongnhanvien = 0; // Khởi tạo tổng số nhân viên
        this.tongdrl =0;
    }
    
   public Phongban(String namephongban,  List<Doanvien> listnhanvien) {
    this.namephongban = namephongban;
    this.listnhanvienphong = new ArrayList<>(); 
    if (listnhanvien != null && !listnhanvien.isEmpty()) {
        this.listnhanvienphong.addAll(listnhanvien);
        for (Doanvien nhanvien : listnhanvienphong) {
            tonggpa += nhanvien.getGpa();          
           
        } 
        for (Doanvien nhanvien : listnhanvienphong) {
            tongdrl += nhanvien.getDrl();          
           
        }
         double roundedNumber1 = Math.round(tonggpa / listnhanvienphong.size() * 100.0) / 100.0;
         double roundedNumber2 = Math.round(tongdrl / listnhanvienphong.size() * 100.0) / 100.0;
        this.drltb = roundedNumber2;
        this.gpatb = roundedNumber1;
        this.tongnhanvien = listnhanvienphong.size();
    } else {
        this.tongnhanvien = 0; 
    }
}
    
    public Phongban(String namephongban, int tongnhanvien,
                    double gpatb, double drltb, List<Doanvien> listnhanvienphong) {
        this.namephongban = namephongban;
       
        this.tongnhanvien = tongnhanvien;
        this.gpatb = gpatb;
        this.drltb =drltb;
        this.listnhanvienphong = listnhanvienphong;
    }

    public String getNamephongban() {
        return namephongban;
    }

    
    public int getTongnhanvien() {
        return tongnhanvien;
    }

    public double getGpatb() {
        return gpatb;
    }
     public double getDrltb() {
        return drltb;
    }
    

    public List<Doanvien> getListnhanvienphong() {
        return listnhanvienphong;
    }

    public void setNamephongban(String namephongban) {
        this.namephongban = namephongban;
    }

   
    public void setTongnhanvien(int tongnhanvien) {
        this.tongnhanvien = tongnhanvien;
    }

    public void setGpatb(double tonggpa) {
        this.gpatb = tonggpa;
    }
    public void setdrltb(double drltb) {
        this.drltb = drltb;
    }
    
    public void setListnhanvienphong(List<Doanvien> listnhanvienphong) {
        this.listnhanvienphong = listnhanvienphong;
    }

   

}
