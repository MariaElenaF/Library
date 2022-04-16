package com.example.atreiaincercare;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ImprumutariController {

    @FXML
    private Button ButonInapoi;

    public void ButonInapoi(ActionEvent event) throws IOException {
        intoarceFereastra();
    }

    public void intoarceFereastra() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Biblioteca.fxml"));

        Stage window = (Stage) ButonInapoi.getScene().getWindow();
        window.setScene(new Scene(root,1100,593));

    }
}
