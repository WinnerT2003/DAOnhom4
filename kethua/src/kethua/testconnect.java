/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kethua;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author AD
 */
public class testconnect {
    private Connection conn;
    public testconnect(){
     try{
     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
     conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1443;databasename=QuanLyDiemThi;"+
                                         "username=sa;password=123456;encrypt=false"
                                         );
}catch(Exception e){
      e.printStackTrace();
}   
    }
    public static void main(String[] args){
         new testconnect();
    }
}

