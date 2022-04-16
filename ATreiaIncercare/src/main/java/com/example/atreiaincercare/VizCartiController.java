package com.example.atreiaincercare;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;


public class VizCartiController {
    @FXML
    private VBox cutie;

    @FXML
    private Label An;

    @FXML
    private Label Autor;

    @FXML
    private Label Editura;

    @FXML
    private Label Gen;

    @FXML
    private Label Pret;

    @FXML
    private Label Titlu;

    @FXML
    private ImageView Poza;

    @FXML
    private Label Descriere;

    @FXML
    private Label DescriereTip;

    /**
     *
     * @param carteViz este initializata - fiecare parametru primeste datele corespunzatoare
     */
    public void setCartiViz(CartiViz carteViz){
        Image imagine = new Image(getClass().getResourceAsStream(carteViz.getPoza()));
        Poza.setImage(imagine);

        Titlu.setText(carteViz.getTitlu1());
        Autor.setText(carteViz.getAutor1());
        An.setText(carteViz.getAn());
        Editura.setText(carteViz.getEditura());
        Gen.setText(carteViz.getGen());
        Pret.setText(carteViz.getPret());
        Descriere.setText(carteViz.getDescriere());
        DescriereTip.setText(carteViz.getDescriereTip());

    }

}
