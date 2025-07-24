package com.dmv.quizapp;

import com.dmv.utils.MyAlert;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class PrimaryController {
    public void handleQuestionManagement(ActionEvent event) throws IOException{
        Scene scene = new Scene(new FXMLLoader(App.class.getResource("questions.fxml")).load());
        
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Quiz App");
        stage.show();
    }
    
    public void handlePractice(ActionEvent event){
        MyAlert.getInstance().showMsg("Coming soon...");
//        Alert alert = new Alert(Alert.AlertType.INFORMATION);
//        alert.setHeaderText("Quiz App");
//        alert.setContentText("Coming soon...");
//        alert.showAndWait();
    }
    
    public void handleExam(ActionEvent event){
        MyAlert.getInstance().showMsg("Coming soon...");
    }
    
    public void handleRegister(ActionEvent event){
        MyAlert.getInstance().showMsg("Coming soon...");
    }
    
    public void handleLogin(ActionEvent event){
        MyAlert.getInstance().showMsg("Coming soon...");
    }
}
