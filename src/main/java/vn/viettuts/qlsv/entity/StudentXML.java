package vn.viettuts.qlsv.entity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "students")
@XmlAccessorType(XmlAccessType.FIELD)
public class StudentXML {
    
    private List<Doanvien> student;

    public List<Doanvien> getStudent() {
        return student;
    }

    public void setStudent(List<Doanvien> student) {
        this.student = student;
    }
    
}
