/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author AD
 */
public class Subjectmodel {
    private int mamon;
    private String tenmon;
    private int sotc;

    public Subjectmodel(int mamon, String tenmon, int sotc) {
        this.mamon = mamon;
        this.tenmon = tenmon;
        this.sotc = sotc;
    }

    public Subjectmodel() {
    }

    public int getMamon() {
        return mamon;
    }

    public void setMamon(int mamon) {
        this.mamon = mamon;
    }

    public String getTenmon() {
        return tenmon;
    }

    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }

    public int getSotc() {
        return sotc;
    }

    public void setSotc(int sotc) {
        this.sotc = sotc;
    }
    
}
