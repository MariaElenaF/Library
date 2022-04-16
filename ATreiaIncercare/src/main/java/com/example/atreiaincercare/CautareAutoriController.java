package com.example.atreiaincercare;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class CautareAutoriController {
    @FXML
    private Button ButonInapoi1;


    public void ButonInapoi1(ActionEvent event) throws IOException {
        intoarceFereastra1();
    }

    public void intoarceFereastra1() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Biblioteca.fxml"));

        Stage window = (Stage) ButonInapoi1.getScene().getWindow();
        window.setScene(new Scene(root,1100,593));

    }
}
