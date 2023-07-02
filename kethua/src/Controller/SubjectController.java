/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.StudentManager;
import Entity.Subjectmodel;
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

/**
 *
 * @author AD
 */
public class SubjectController {
    public  List<Subjectmodel>getall(){
        List<Subjectmodel> sv = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try{
            
            String urldb = "jdbc:sqlserver://localhost:1443; databasename=DiemThi; encrypt=false ";
            String userName = "sa";
            String password = "123456";
            connection = DriverManager.getConnection(urldb, userName, password);
            String sql = "select * from Tenmon";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                Subjectmodel sub = new Subjectmodel(resultSet.getInt("mamon"),resultSet.getString("tenmon"),
                                                    resultSet.getInt("soTC"));
                
                sv.add(sub);
            }
        }catch(SQLException ex){
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sv;
    }
    public static void insert(Subjectmodel sv){
        Connection connection = null;
        PreparedStatement statement = null;
        try{
            String urldb = "jdbc:sqlserver://localhost:1443; databasename=DiemThi; encrypt=false ";
            String userName = "sa";
            String password = "123456";
            connection = DriverManager.getConnection(urldb, userName, password);
            String sql  = "insert into Tenmon(mamon,tenmon,soTC) values(?, ?, ?)";
            statement = connection.prepareCall(sql);
            statement.setInt(1, sv.getMamon());
            statement.setString(2, sv.getTenmon());
            statement.setInt(3, sv.getSotc());
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
    public static void delete(int id){
        Connection connection = null;
        PreparedStatement statement = null;
        try{
            String urldb = "jdbc:sqlserver://localhost:1443; databasename=DiemThi; encrypt=false ";
            String userName = "sa";
            String password = "123456";
            connection = DriverManager.getConnection(urldb, userName, password);
            String sql = "delete from Tenmon where mamon = ?";
            statement = connection.prepareCall(sql);
            statement.setInt(1, id);
            statement.execute();
        }catch(SQLException ex){
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    public List<Subjectmodel>FindbyId(int ID){
        List<Subjectmodel> sv = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        try{
            String urldb = "jdbc:sqlserver://localhost:1443; databasename=DiemThi; encrypt=false ";
            String userName = "sa";
            String password = "123456";
            connection = DriverManager.getConnection(urldb, userName, password);
            String sql = "select * from Tenmon where mamon = ?";
            statement = connection.prepareCall(sql);
            statement.setInt(1, ID);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                Subjectmodel sub = new Subjectmodel(resultSet.getInt("mamon"),resultSet.getString("tenmon"),
                                                    resultSet.getInt("soTC"));
                sv.add(sub);
            }
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
        return sv;
    }
    public static void update(Subjectmodel sv){
        Connection connection = null;
        PreparedStatement statement = null;
        try{
            String urldb = "jdbc:sqlserver://localhost:1443; databasename=DiemThi; encrypt=false ";
            String userName = "sa";
            String password = "123456";
            connection = DriverManager.getConnection(urldb, userName, password);
            String sql = "Update Tenmon set mamon = ?, tenmon = ?, soTC = ? where mamon = ?";
            statement = connection.prepareCall(sql);
            statement.setInt(1, sv.getMamon());
            statement.setString(2, sv.getTenmon());
            statement.setInt(3, sv.getSotc());
            statement.setInt(4, sv.getMamon());
            statement.execute();
        }catch(SQLException ex){
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public int getsizeSub(String name){
        List<Subjectmodel> sub = new ArrayList<>();
        List<Subjectmodel>subb = new ArrayList<>();
        sub = getall();
        for(int i = 0; i < sub.size(); i++){
            if(name.equalsIgnoreCase(sub.get(i).getTenmon())){
                subb.add(sub.get(i));
            }
        }
        return subb.size();
    }
    public int getsizesubID(int id){
        List<Subjectmodel>sv = new ArrayList<>();
        List<Subjectmodel>svv = new ArrayList<>();
        sv = getall();  
        for(int i = 0; i < sv.size() ; i++){
            if(id == sv.get(i).getMamon()){
                svv.add(sv.get(i));
            }
        }
        return svv.size();
    }
}
