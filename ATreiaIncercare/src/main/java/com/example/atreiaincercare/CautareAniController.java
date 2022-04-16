package com.example.atreiaincercare;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;

public class CautareAniController {
    @FXML
    private Button ButonInapoi3;

    /**
     *
     * @param event Daca butonul este apasat, te da la fereastra principala: "Biblioteca.fxml"
     *              Asta se intampla la toate ferestrele care nu sunt: "Biblioteca.fxml" si "Login.fxml"
     * @throws IOException Face acelasi lucru de fiecare data, este pentru a se ocupa de erori
     *
     */
    public void ButonInapoi3(ActionEvent event) throws IOException {
        intoarceFereastra1();
    }

    public void intoarceFereastra1() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Biblioteca.fxml"));

        Stage window = (Stage) ButonInapoi3.getScene().getWindow();
        window.setScene(new Scene(root,1100,593));

    }
}
