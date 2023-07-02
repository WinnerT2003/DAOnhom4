/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Entity.Sinhvien;
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
public class StudentManager {
    public  List<Sinhvien>getall(){
        List<Sinhvien> sv = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try{
            
            String urldb = "jdbc:sqlserver://localhost:1443; databasename=DiemThi; encrypt=false ";
            String userName = "sa";
            String password = "123456";
            connection = DriverManager.getConnection(urldb, userName, password);
            String sql = "select * from Sinhvie";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                Sinhvien std = new Sinhvien(resultSet.getInt("Id"), resultSet.getString("Fullname"),
                                          resultSet.getString("email"), resultSet.getString("Phonenum"),
                                          resultSet.getString("gender"),resultSet.getString("Class"));
                
                sv.add(std);
            }
        }catch(SQLException ex){
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sv;
    }
    public static void insert(Sinhvien sv){
        Connection connection = null;
        PreparedStatement statement = null;
        try{
            String urldb = "jdbc:sqlserver://localhost:1443; databasename=DiemThi; encrypt=false ";
            String userName = "sa";
            String password = "123456";
            connection = DriverManager.getConnection(urldb, userName, password);
            String sql  = "insert into Sinhvie(Id, Fullname, gender, email, Phonenum, Class) values(?, ?, ?, ?, ?, ?)";
            statement = connection.prepareCall(sql);
            statement.setInt(1, sv.getMasv());
            statement.setString(2, sv.getTensv());
            statement.setString(3, sv.getGender());
            statement.setString(4, sv.getEmail());
            statement.setString(5, sv.getPhonenum());
            statement.setString(6, sv.getLop());
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
            String sql = "delete from Sinhvie where id = ?";
            statement = connection.prepareCall(sql);
            statement.setInt(1, id);
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
    public static void update(Sinhvien sv){
        Connection connection = null;
        PreparedStatement statement = null;
        try{
            String urldb = "jdbc:sqlserver://localhost:1443; databasename=DiemThi; encrypt=false ";
            String userName = "sa";
            String password = "123456";
            connection = DriverManager.getConnection(urldb, userName, password);
            String sql = "Update Sinhvie set Fullname = ?, gender = ?, email = ?, Phonenum = ?, Class = ? where Id = ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, sv.getTensv());
            statement.setString(2, sv.getGender());
            statement.setString(3, sv.getEmail());
            statement.setString(4, sv.getPhonenum());
            statement.setString(5, sv.getLop());
            statement.setInt(6, sv.getMasv());
            statement.execute();
        }catch(SQLException ex){
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<Sinhvien>FindbyId(int ID){
        List<Sinhvien> sv = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        try{
            String urldb = "jdbc:sqlserver://localhost:1443; databasename=DiemThi; encrypt=false ";
            String userName = "sa";
            String password = "123456";
            connection = DriverManager.getConnection(urldb, userName, password);
            String sql = "select * from Sinhvie where id = ?";
            statement = connection.prepareCall(sql);
            statement.setInt(1, ID);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                Sinhvien std = new Sinhvien(resultSet.getInt("Id"), resultSet.getString("Fullname"),
                                          resultSet.getString("email"), resultSet.getString("Phonenum"),
                                          resultSet.getString("gender"),resultSet.getString("Class"));
                sv.add(std);
            }
        }catch(SQLException ex){
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sv;
    }
    public int GetIDtontai(int id)
    {
        List<Sinhvien>sv = new ArrayList<>();
        List<Sinhvien>svv = new ArrayList<>();
        sv = getall();  
        for(int i = 0; i < sv.size() ; i++){
            if(id == sv.get(i).getMasv()){
                svv.add(sv.get(i));
            }
        }
        return svv.size();
    }
     public int getIDName(int id, String Tensinhvien){//Kiem tra ten sinh vien khop voi mssv ko
     List<Sinhvien>l = new ArrayList<>();
      List<Sinhvien>list = new ArrayList<>();
      StudentManager stu = new StudentManager();
      list = stu.FindbyId(id);
       for(int i = 0; i < list.size(); i++){
         if(list.get(0).getTensv().equalsIgnoreCase(Tensinhvien)){
           l.add(list.get(i));
         }
     }
     return l.size();
  }
}
