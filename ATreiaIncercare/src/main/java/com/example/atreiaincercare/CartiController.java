package com.example.atreiaincercare;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import com.example.atreiaincercare.Carte;


public class CartiController {

    @FXML
    private Label autor;

    @FXML
    private ImageView imagineSrc;

    @FXML
    private Label titlu;


    /**
     *
     * @param carte este initializata - fiecare parametru primeste datele corespunzatoare
     */
    public void setCarte(Carte carte){

        Image imagine = new Image(getClass().getResourceAsStream(carte.getImagineSrc()));
        imagineSrc.setImage(imagine);
        titlu.setText(carte.getTitlu());
        autor.setText(carte.getAutor());
    }




}
