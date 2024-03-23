package com.BankingProject.Database;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionDB {
    private String serverName;
    private int portNumber;
    private String databaseName;
    private String user;
    private String password;
    private Connection conn;

    public ConnectionDB() {
    }

    public ConnectionDB(String serverName, int portNumber, String user, String password) {
        this.serverName = serverName;
        this.portNumber = portNumber;
        this.user = user;
        this.password = password;
        this.conn = null;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public int getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(int portNumber) {
        this.portNumber = portNumber;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }
 
    public Connection getConn(){
        SQLServerDataSource ds = new SQLServerDataSource();
        
        ds.setServerName(this.getServerName());
        ds.setUser(this.getUser());
        ds.setPassword(this.getPassword());
        ds.setPortNumber(this.getPortNumber());
        ds.setEncrypt("true");
        ds.setTrustServerCertificate(true);
        
        try{
            this.conn = ds.getConnection();
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return conn;
    }
    
    public static void closeConnection(Connection conn){
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
