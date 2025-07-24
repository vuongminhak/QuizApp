/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dmv.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author vuong
 */
public class JdbcConnector {
    private static JdbcConnector instance;
    private final Connection conn;
    
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.getLogger(JdbcConnector.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
    
    private JdbcConnector() throws SQLException{
        this.conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost/quizdb",
                        "root", "vuongdo5028"
                );
   
    }
    
    public static JdbcConnector getInstance() throws SQLException{
        if (instance == null)
            instance = new JdbcConnector();
        return instance;
    }
    
    public Connection connect(){
        return this.conn;
    }
    
    public void close() throws SQLException{
        if( this.conn != null )
            this.conn.close();
    }
}
