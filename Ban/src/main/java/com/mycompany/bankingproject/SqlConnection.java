
package com.mycompany.bankingproject;

/**
 *
 * @author trung
 */
import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;

public class SqlConnection {

  public static void main(String[] args) {

    // Create a variable for the connection string.

    String connectionUrl = "jdbc:sqlserver://KIN\\CLIENT1:1435;databaseName=NGANHANG;user=sa;password=24122003;encrypt=true;trustServerCertificate=true";
    
    try{
        Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();

        String SQL = "SELECT * FROM [NGANHANG].[dbo].[NhanVien]";

        ResultSet rs = stmt.executeQuery(SQL);

        // Iterate through the data in the result set and display it.

        while (rs.next()) {

          System.out.println(rs.getString("MANV"));

        }

    }

    // Handle any errors that may have occurred.

        catch (SQLException e) {

          e.printStackTrace();

        }

  }

}
