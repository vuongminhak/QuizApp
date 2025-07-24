/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.dmv.quizapp;

import com.dmv.pojo.Category;
import com.dmv.services.CategoryServices;
import com.dmv.utils.JdbcConnector;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author vuong
 */
public class QuestionsController implements Initializable {
    @FXML private ComboBox<Category> cbCates;
    
    private final static CategoryServices cateServices = new CategoryServices(); 

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {  
                this.cbCates.setItems(FXCollections.observableList(cateServices.getCates()));
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
    }       
}
