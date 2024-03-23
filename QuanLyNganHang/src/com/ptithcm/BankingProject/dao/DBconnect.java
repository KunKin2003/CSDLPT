package com.ptithcm.BankingProject.dao;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnect {
    
    //Kết nối server gốc
    public static Connection getConnection(){
        try {
            Connection connection = null;
            String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=NGANHANG;"
                + "user=sa;password=24122003;encrypt=true;trustServerCertificate=true";
        
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(connectionUrl);
            return connection;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    
    //Kết nối theo chi nhánh
    public static Connection getConnection(String tenCN, String username, String pass){
        try {
            Connection connection = null;
            String portNumber;
            if(tenCN.equals("Bến Thành")){
                portNumber = "1435";
            }
            else{
                portNumber = "1436";
            }
            String connectionUrl = "jdbc:sqlserver://localhost:" + portNumber + ";databaseName=NGANHANG;"
                + "user=" + username +";password=" +  pass + ";encrypt=true;trustServerCertificate=true";
        
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(connectionUrl);
            return connection;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public static void main(String[] args) throws SQLException{
        Connection c = getConnection();
        System.out.println(c.toString());
        try(Connection con = getConnection("Bến Thành", "nhn", "24122003")){
            System.out.println("Kết nối chi nhánh Bến Thành");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        c.close();
    }
        
}
