package com.example.atreiaincercare;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class CautareCategoriiControler {

    @FXML
    private Button ButonInapoi4;


    public void ButonInapoi4(ActionEvent event) throws IOException {
        intoarceFereastra4();
    }

    public void intoarceFereastra4() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Biblioteca.fxml"));

        Stage window = (Stage) ButonInapoi4.getScene().getWindow();
        window.setScene(new Scene(root,1100,593));

    }
}
