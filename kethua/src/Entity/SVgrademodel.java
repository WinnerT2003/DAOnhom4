/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author AD
 */
public class SVgrademodel {
    private String tensv;
    private float diemgk;
    private float diemck;
    private float diemtong;
    private String subject;
    private String truot;
    private int id;
    private String diemchu;
    private float diemTB;
    private String lop;
    public SVgrademodel(int id, String tensv, float diemgk, float diemck, float diemtong, String subject) {
        this.tensv = tensv;
        this.diemgk = diemgk;
        this.diemck = diemck;
        this.diemtong = diemtong;
        this.subject = subject;
        this.id = id;
    }
   
    public SVgrademodel(int id, String tensv, float diemgk, float diemck, String subject) {
        this.tensv = tensv;
        this.diemgk = diemgk;
        this.diemck = diemck;
        this.subject = subject;
        this.id = id;
    }

    public SVgrademodel(int id, String tensv, float diemTB, String diemchu) {
        this.tensv = tensv;
        this.id = id;
        this.diemchu = diemchu;
        this.diemTB = diemTB;
    }

    public SVgrademodel(float diemgk, float diemck, float diemtong, String subject) {
        this.diemgk = diemgk;
        this.diemck = diemck;
        this.diemtong = diemtong;
        this.subject = subject;
    }


    public SVgrademodel(String subject, float diemTB, String lop) {
        this.subject = subject;
        this.diemTB = diemTB;
        this.lop = lop;
    }

    public SVgrademodel(int id,String tensv,String subject, float diemtong,String truot) {
        this.tensv = tensv;
        this.truot = truot;
        this.id = id;
        this.subject = subject;
        this.diemtong = diemtong;
    }
    
    public SVgrademodel() {
    }

    public String getTensv() {
        return tensv;
    }

    public void setTensv(String tensv) {
        this.tensv = tensv;
    }

    public float getDiemgk() {
        return diemgk;
    }

    public void setDiemgk(float diemgk) {
        this.diemgk = diemgk;
    }

    public float getDiemck() {
        return diemck;
    }

    public void setDiemck(float diemck) {
        this.diemck = diemck;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public float getDiemtong() {
        return diemtong;
    }

    public void setDiemtong(float diemtong) {
        this.diemtong = diemtong;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTruot() {
        return truot;
    }

    public int getId() {
        return id;
    }

    public String getDiemchu() {
        return diemchu;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public String getLop() {
        return lop;
    }
    
}
