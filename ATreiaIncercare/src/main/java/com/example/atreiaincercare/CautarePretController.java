package com.example.atreiaincercare;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class CautarePretController {
    @FXML
    private Button ButonInapoi5;

    public void ButonInapoi5(ActionEvent event) throws IOException {
        intoarceFereastra5();
    }

    public void intoarceFereastra5() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Biblioteca.fxml"));

        Stage window = (Stage) ButonInapoi5.getScene().getWindow();
        window.setScene(new Scene(root,1100,593));

    }
}
