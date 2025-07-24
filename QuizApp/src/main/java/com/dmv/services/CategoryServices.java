/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dmv.services;

import com.dmv.pojo.Category;
import com.dmv.utils.JdbcConnector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vuong
 */
public class CategoryServices {
    public List<Category> getCates() throws SQLException{
        Connection conn = JdbcConnector.getInstance().connect();
        Statement stm = conn.createStatement();
                ResultSet rs =stm.executeQuery("SELECT * FROM category");
                
                List<Category> cates = new ArrayList<>();
              
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    
                    Category c = new Category(id, name);
                    cates.add(c);
                }
        return cates;
    }
}
