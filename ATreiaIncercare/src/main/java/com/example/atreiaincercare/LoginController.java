package com.example.atreiaincercare;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import java.io.IOException;


public class LoginController {

    @FXML
    private TextField ID;

    @FXML
    private PasswordField Parola;

    @FXML
    private Label parolaIncorecta;

    @FXML
    private Button ButonLogin;

    /**
     *
     * @param event Daca butonul de login este apasat si datele introduse sunt cele bune, te duce pe fereastra principala "Biblioteca.fxml"
     * @throws IOException
     */
    public void ButonLogin(ActionEvent event) throws IOException {
        String user = ID.getText();
        String pass = Parola.getText();

        if (user.equals("maria") && pass.equals("1234")){
            System.out.println("te-ai loggat");
            schimbaFereastra();
        }
        else{
            parolaIncorecta.setText("Ai introdus parola incorecta");

        }


    }
    public void schimbaFereastra() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Biblioteca.fxml"));

        Stage window = (Stage) ButonLogin.getScene().getWindow();
        window.setScene(new Scene(root,1100,593));

    }

    }
