/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.StudentManager;
import Entity.TKmodel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.Loginview;
import view.QlySInhvien;
import view.Qlydiemthiview;
import view.Quanlymonview;

/**
 *
 * @author AD
 */
public class TKmanager {
    public List<TKmodel>getall(){
        List<TKmodel> tk = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try{
            
            String urldb = "jdbc:sqlserver://localhost:1443; databasename=DiemThi; encrypt=false ";
            String userName = "sa";
            String password = "123456";
            connection = DriverManager.getConnection(urldb, userName, password);
            String sql = "select distinct username,passwords from TK";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                TKmodel std = new TKmodel(resultSet.getString("username"), resultSet.getString("passwords"));
                tk.add(std);
            }
            System.out.println(2);
        }catch(SQLException ex){
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if(statement != null){
            try{
                statement.close();
            }
            catch(SQLException ex){
                Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(connection != null){
           try{
               connection.close();
           } catch(SQLException ex){
               Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
   }
        System.out.println(tk.get(1).getPassword());
        return tk;
    }
    
    public void checkUser(String pass, String user){
        Loginview login = new Loginview();
        List<TKmodel>list = new ArrayList<>();
        TKmanager tkk = new TKmanager();
        list = tkk.getall();
        if(pass.equalsIgnoreCase("123456")&&user.equalsIgnoreCase("admin")){
            QlySInhvien sinhvie = new QlySInhvien();
            sinhvie.setVisible(true);
        }
        else if(pass.equalsIgnoreCase("123456")&&user.equalsIgnoreCase("admin1")){
            Qlydiemthiview qly = new Qlydiemthiview();
            qly.setVisible(true);
        }
         else if(pass.equalsIgnoreCase("123456")&&user.equalsIgnoreCase("admin2")){
            Quanlymonview qly = new Quanlymonview();
            qly.setVisible(true);
        }
         
    }
    public boolean checkStudent(String pass, String user){
        List<TKmodel>list = new ArrayList<>();
        TKmanager tkk = new TKmanager();
        list = tkk.getall();
        for(int i = 0; i < list.size();i++){
            if(pass.equals(list.get(i).getPassword()) 
                    && user.equals(list.get(i).getUsername())){
                return true;
            }
        }
        return false;
    }
public  void insert(){
        Connection connection = null;
        PreparedStatement statement = null;
        try{
            String urldb = "jdbc:sqlserver://localhost:1443; databasename=DiemThi; encrypt=false ";
            String userName = "sa";
            String password = "123456";
            connection = DriverManager.getConnection(urldb, userName, password);
            String sql  = "insert into TK(username, passwords) select Id,Id from Sinhvie";
            statement = connection.prepareCall(sql);
            
            statement.execute();
        }catch(SQLException ex){
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if(statement != null){
            try{
                statement.close();
            }
            catch(SQLException ex){
                Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(connection != null){
           try{
               connection.close();
           } catch(SQLException ex){
               Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
}
    }
}
