/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author AD
 */
public class Sinhvien {
    private String Tensv;
    private int Masv;
    private String email;
    private String Phonenum;
    private String gender;
    String lop;
    public Sinhvien()
    {
        
    }

    public Sinhvien(int Masv, String Tensv, String email, String Phonenum, String gender, String lop) {
        this.Tensv = Tensv;
        this.Masv = Masv;
        this.email = email;
        this.Phonenum = Phonenum;
        this.gender = gender;
        this.lop = lop;
    }

    public Sinhvien(String Tensv, String email, String Phonenum, String gender) {
        this.Tensv = Tensv;
        this.email = email;
        this.Phonenum = Phonenum;
        this.gender = gender;
        
    }

    public String getTensv() {
        return Tensv;
    }

    public void setTensv(String Tensv) {
        this.Tensv = Tensv;
    }

    public int getMasv() {
        return Masv;
    }

    public void setMasv(int Masv) {
        this.Masv = Masv;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenum() {
        return Phonenum;
    }

    public void setPhonenum(String Phonenum) {
        this.Phonenum = Phonenum;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
   
}
