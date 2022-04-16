package com.example.atreiaincercare;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class BibliotecaController implements Initializable{

    @FXML
    private Button ButonAni;

    @FXML
    private Button ButonAutori;

    @FXML
    private Button ButonCategorii;

    @FXML
    private Button ButonEditura;

    @FXML
    private Button ButonPret;

    @FXML
    private Button ButonCarti;

    @FXML
    private GridPane carteConteiner;

    @FXML
    private Button imprumut;

    private List<Carte>carti;

    /**
     *
     * functia "initialize" creeaza lista de carti in interiorul "Biblioteca.fxml"
     */
    @Override
    public void initialize(URL url,ResourceBundle resourceBundle){
        carti = new ArrayList<>(carti());


        int linii = 1;
        int coloane=0;

        try{
            for(Carte carte : carti){
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("carti.fxml"));
                VBox cutie = fxmlLoader.load();
                CartiController cartiController = fxmlLoader.getController();
                cartiController.setCarte(carte);

                if(coloane == 3){
                    coloane=0;
                    ++linii;
                }
                carteConteiner.add(cutie,coloane++,linii);
                GridPane.setMargin(cutie,new Insets(15));
            }
        }catch (IOException e){
            e.printStackTrace();
        }



    }

    /**
     *
     * @return returneaza lista de carti
     *
     */
    private List<Carte>carti(){
        List<Carte> carteLista = new ArrayList<>();

        Carte carte = new Carte();
        carte.setImagineSrc("/imagini/poezii-mihai-eminescu_1_fullsize.jpg");
        carte.setTitlu("Poezii");
        carte.setAutor("Mihai Eminescu");
        carteLista.add(carte);

        carte = new Carte();
        carte.setImagineSrc("/imagini/res_db43b1ab1875bed45685d5fda21b5b9c.jpg");
        carte.setTitlu("Poezii alese");
        carte.setAutor("George Bacovia");
        carteLista.add(carte);


        carte = new Carte();
        carte.setImagineSrc("/imagini/5948486009238-1739843-240.jpg");
        carte.setTitlu("Morometii");
        carte.setAutor("Marin Preda");
        carteLista.add(carte);



        carte = new Carte();
        carte.setImagineSrc("/imagini/778255.jpg");
        carte.setTitlu("Ion");
        carte.setAutor("Liviu Rebreanu");
        carteLista.add(carte);



        carte = new Carte();
        carte.setImagineSrc("/imagini/Moaracunoroc2.jpg");
        carte.setTitlu("Moara cu noroc");
        carte.setAutor("Ioan Slavici");
        carteLista.add(carte);



        carte = new Carte();
        carte.setImagineSrc("/imagini/enigma-otiliei-george-calinescu-9786068391359.jpg");
        carte.setTitlu("Enigma Otiliei");
        carte.setAutor("George Calinescu");
        carteLista.add(carte);



        carte = new Carte();
        carte.setImagineSrc("/imagini/689961.jpg");
        carte.setTitlu("Baltagul");
        carte.setAutor("Mihail Sadoveanu");
        carteLista.add(carte);



        carte = new Carte();
        carte.setImagineSrc("/imagini/9786068044484-2496130.jpg");
        carte.setTitlu("Toporisca");
        carte.setAutor("Gary Paulsen");
        carteLista.add(carte);



        carte = new Carte();
        carte.setImagineSrc("/imagini/matilda-roald-dahl-format-mare-s-1-cover_huge.jpg");
        carte.setTitlu("Matilda");
        carte.setAutor("Roald Dahl");
        carteLista.add(carte);



        carte = new Carte();
        carte.setImagineSrc("/imagini/magisterium-testul-fierului-holly-black-cassandra-clare-carti-copii-editura-corint-junior.jpg");
        carte.setTitlu("Magisterium *");
        carte.setAutor("Holly Black");
        carteLista.add(carte);



        carte = new Carte();
        carte.setImagineSrc("/imagini/scoala-de-magie-magisterium-manusa-de-arama-vol-2_1_fullsize.jpg");
        carte.setTitlu("Magisterium **");
        carte.setAutor("Holly Black");
        carteLista.add(carte);



        carte = new Carte();
        carte.setImagineSrc("/imagini/httpswww.universenciclopedic.romediacatalogproductchcheia-de-bronz-magisterium-vol-3_1_fullsize.jpg");
        carte.setTitlu("Magisterium ***");
        carte.setAutor("Holly Black");
        carteLista.add(carte);

    return carteLista;
    }

    /**
     *
     * @param event Daca butonul este apasat, schimba fereastra cu functia "schimbaFereastraI()" // Asta se intampla cu toate butoanele
     * @throws IOException Face acelasi lucru de fiecare data, este pentru a se ocupa de erori
     *
     */
    public void ButonImprumut(ActionEvent event) throws IOException {
            schimbaFereastraI();
    }

    public void schimbaFereastraI() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Imprumutari.fxml"));

        Stage window = (Stage) imprumut.getScene().getWindow();
        window.setScene(new Scene(root,600,395));

    }

    public void ButonCautareAutori(ActionEvent event) throws IOException {
        schimbaFereastraAutori();
    }

    public void schimbaFereastraAutori() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("CautareAutori.fxml"));

        Stage window = (Stage) ButonAutori.getScene().getWindow();
        window.setScene(new Scene(root,600,400));

    }

    public void ButonCautareEditura(ActionEvent event) throws IOException {
        schimbaFereastraEditura();
    }

    public void schimbaFereastraEditura() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("CautareEditura.fxml"));

        Stage window = (Stage) ButonEditura.getScene().getWindow();
        window.setScene(new Scene(root,600,400));

    }

    public void ButonCautareAni(ActionEvent event) throws IOException {
        schimbaFereastraAni();
    }

    public void schimbaFereastraAni() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("CautareAni.fxml"));

        Stage window = (Stage) ButonAni.getScene().getWindow();
        window.setScene(new Scene(root,600,400));

    }

    public void ButonCautareCategorii(ActionEvent event) throws IOException {
        schimbaFereastraCategorii();
    }

    public void schimbaFereastraCategorii() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("CautareCategorii.fxml"));

        Stage window = (Stage) ButonCategorii.getScene().getWindow();
        window.setScene(new Scene(root,600,400));

    }

    public void ButonCautarePret(ActionEvent event) throws IOException {
        schimbaFereastraPret();
    }

    public void schimbaFereastraPret() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("CautarePret.fxml"));

        Stage window = (Stage) ButonPret.getScene().getWindow();
        window.setScene(new Scene(root,600,400));

    }


    public void ButonCautareCarti(ActionEvent event) throws IOException {
        schimbaFereastraCarti();
    }

    public void schimbaFereastraCarti() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("VizualizareCartiTOATE.fxml"));

        Stage window = (Stage) ButonCarti.getScene().getWindow();
        window.setScene(new Scene(root,1100,605));

    }
}
