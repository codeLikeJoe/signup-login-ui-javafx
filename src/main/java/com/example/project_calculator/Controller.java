package com.example.project_calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Controller {
    private Parent root;
    private Stage stage;
    private Scene scene;

    public void SignIn_signUpPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("sign-in-view.fxml"));
        scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);

        scene.setFill(Color.TRANSPARENT);
        stage.initStyle(StageStyle.TRANSPARENT);

        stage.show();
    }

    public void SignUp_signInPage(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("sign-up-view.fxml"));
        scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        scene.setFill(Color.TRANSPARENT);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.show();
    }

    public void exit(){
        System.exit(0);
    }

}