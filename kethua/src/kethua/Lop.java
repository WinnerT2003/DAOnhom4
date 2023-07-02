/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kethua;

import Entity.Sinhvien;

/**
 *
 * @author AD
 */
public class Lop {
    private String Tenlop;
    private String malop;
    Sinhvien sinhvien;
    public Lop(){};
    public Lop(String Tenlop, String malop)
    {
        this.Tenlop = Tenlop;
        this.malop = malop;
    }
    public void settenLop(String tenlop)
    {
        this.Tenlop = tenlop;
    }
    public void setmaLop(String malop)
    {
        this.malop = malop;
    }
   
}
