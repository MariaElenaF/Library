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

public class VizualizareCartiTOATEController implements Initializable {

    @FXML
    private GridPane containerulCartii;

    private List<CartiViz> cartiViz;
    /**
     *
     * functia "initialize" creeaza lista de cartiViz in interiorul "VizualizareCartiTOATE.fxml"
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        cartiViz = new ArrayList<>(cartiViz());

        int linii = 1;
        int coloane=0;

        try {
            for (CartiViz carteVizI : cartiViz) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("VizCarti.fxml"));
                VBox cutie = fxmlLoader.load();

                VizCartiController vizCartiController = fxmlLoader.getController();
                vizCartiController.setCartiViz(carteVizI);

                if(coloane == 1){
                    coloane=0;
                    ++linii;
                }

                containerulCartii.add(cutie, coloane++,linii);
                GridPane.setMargin(cutie, new Insets(20));
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @return returneaza lista de carti vizualizate indetaliat
     *
     */
    private List<CartiViz>cartiViz(){

        List<CartiViz> cartiLista = new ArrayList<>();

        CartiViz carte = new CartiViz();
        carte.setPoza("/imagini/poezii-mihai-eminescu_1_fullsize.jpg");
        carte.setTitlu1("Poezii");
        carte.setAutor1("Mihai Eminescu");
        carte.setEditura("Corint Books");
        carte.setAn("2003");
        carte.setGen("Poezie");
        carte.setPret("10 RON");
        carte.setDescriereTip("Descriere:");
        carte.setDescriere("\"Eminescu este nu numai cel mai mare scriitor roman. El este o aparitie aproape neexplicabila in literatura noastra. El a cazut in sarmana noastra literatura de la 1870 ca un meteor din alte lumi. Intamplarea a facut ca unul din cei mai mari poeti lirici ai se colului al XIX-lea, secol atat de bogat, cel mai bogat in lirici, sa se nasca la noi, intr-un colt din fundul Moldovei.\"  -GARABET IBRAILEANU");
        cartiLista.add(carte);

        carte = new CartiViz();
        carte.setPoza("/imagini/res_db43b1ab1875bed45685d5fda21b5b9c.jpg");
        carte.setTitlu1("Poezii alese");
        carte.setAutor1("George Bacovia");
        carte.setEditura("Arthur");
        carte.setAn("2004");
        carte.setGen("Poezie");
        carte.setPret("12 RON");
        carte.setDescriereTip("Descriere:");
        carte.setDescriere("George Bacovia a fost un scriitor roman format la scoala simbolismului literar francez. Este autorul unor volume de versuri si proza scrise în baza unei tehnici unice în literatura romana, cu vadite influente din marii lirici moderni francezi pe care-i admira.");
        cartiLista.add(carte);


        carte = new CartiViz();
        carte.setPoza("/imagini/5948486009238-1739843-240.jpg");
        carte.setTitlu1("Morometii");
        carte.setAutor1("Marin Preda");
        carte.setEditura("Litera");
        carte.setAn("2009");
        carte.setGen("Literatura clasica");
        carte.setPret("32 RON");
        carte.setDescriereTip("Descriere:");
        carte.setDescriere("Prin Morometii, Marin Preda ne vorbeste de tarani cum nu se mai vorbise pana la el. Intr-o literatura saturata, aparent, de materia vietii taranesti, aceasta aparitie parea imposibila. Izvorul parea epuizat si o adevarata campanie pragmatica impotriva literaturii cu subiecte rurale contribuise si ea, decisiv, la consolidarea impresiei. Marin Preda ne descopera totusi o lume inedita, scaldata intr-o lumina solara care alunga tenebrele.\n" +
                "Mihai Ungureanu");
        cartiLista.add(carte);



        carte = new CartiViz();
        carte.setPoza("/imagini/778255.jpg");
        carte.setTitlu1("Ion");
        carte.setAutor1("Liviu Rebreanu");
        carte.setEditura("Hera");
        carte.setAn("2008");
        carte.setGen("Literatura clasica");
        carte.setPret("16 RON");
        carte.setDescriereTip("Descriere:");
        carte.setDescriere("Ion este primul roman obiectiv din literatura romana, fiind aparut in anul 1920, dupa o lunga perioada de elaborare, asa cum insusi autorul mentioneaza in finalul operei, intre martie 1913 - iulie 1920. Aparitia romanului a starnit un adevarat entuziasm in epoca, mai ales ca nimic din creatia nuvelistica de pana atunci nu anunta aceasta evolutie spectaculoasa.");
        cartiLista.add(carte);



        carte = new CartiViz();
        carte.setPoza("/imagini/Moaracunoroc2.jpg");
        carte.setTitlu1("Moara cu noroc");
        carte.setAutor1("Ioan Slavici");
        carte.setEditura("ePublishers");
        carte.setAn("2008");
        carte.setGen("Literatura clasica");
        carte.setPret("20 RON");
        carte.setDescriereTip("Descriere:");
        carte.setDescriere("Moara cu noroc descrie zbuciumul interior prin care trece Ghita, sfasiat de dorinte puternice si contradictorii: pe de-o parte el vrea sa ramana onest si langa familie, pe de alta parte vrea sa se imbogateasca rapid si fara efort. Dornic sa faca repede avere, el se indeparteaza de sotia lui, Ana, si devine treptat complicele lui Lica la diverse neleguiri.In incercarea de a scapa de sub influenta nefasta a samadaului si de a-l preda autoritatilor, Ghita isi arunca sotia in bratele lui Lica. Dezgustata de lasitatea sotului, Ana i se daruieste lui Lica...");
        cartiLista.add(carte);



        carte = new CartiViz();
        carte.setPoza("/imagini/enigma-otiliei-george-calinescu-9786068391359.jpg");
        carte.setTitlu1("Enigma Otiliei");
        carte.setAutor1("George Calinescu");
        carte.setEditura("Angora");
        carte.setAn("2018");
        carte.setGen("Literatura clasica");
        carte.setPret("25 RON");
        carte.setDescriereTip("Descriere:");
        carte.setDescriere("Romanul cu nuante balzaciene are ca tema centrala burghezia, ce dezgoleste sufletului uman, lasandu-l fara scrupule si valori morale. Felix, un tanar orfan si pasionat de medicina merge sa studieze la Bucuresti, spre a fi gazduit de catre unchiul sau Costache Giurgiuveanu. Costache, un batran cu o oarecare agonisire datorata propriei zgarcenii, posedat de egoism si dragoste pentru fiica sa adoptata, Otilia, isi duce existenta intr-un mod superficial, alaturi de familia Tulea si pretentiosul Pascalopol, prieten si pretendent al Otiliei.");
        cartiLista.add(carte);



        carte = new CartiViz();
        carte.setPoza("/imagini/689961.jpg");
        carte.setTitlu1("Baltagul");
        carte.setAutor1("Mihail Sadoveanu");
        carte.setEditura("MIHAIL SADOVEANU");
        carte.setAn("2016");
        carte.setGen("Literatura clasica");
        carte.setPret("18 RON");
        carte.setDescriereTip("Descriere:");
        carte.setDescriere("Drama omeneasca, provestea din Baltagul poarta totusi un pronuntat accent de mare balada, romantanta de mister cosmic, aici rezolvandu-se epic, dupa cum in Hanu Ancutei se rezolva feeric.");
        cartiLista.add(carte);



        carte = new CartiViz();
        carte.setPoza("/imagini/9786068044484-2496130.jpg");
        carte.setTitlu1("Toporisca");
        carte.setAutor1("Gary Paulsen");
        carte.setEditura("Arthur");
        carte.setAn("2013");
        carte.setGen("Thriller");
        carte.setPret("40 RON");
        carte.setDescriereTip("Descriere:");
        carte.setDescriere("Toporisca este un adevarat manual de supravietuire in salbaticie, din care poti afla cum sa faci focul fara chibrituri, cum sa vanezi sau sa-ti construiesti un adapost atunci cand n-ai la indemana decat cele mai primitive unelte. Dar cel mai important lucru pe care-l poti invata din aceasta carte este cum sa-ti infrangi disperarea si teama.");
        cartiLista.add(carte);



        carte = new CartiViz();
        carte.setPoza("/imagini/matilda-roald-dahl-format-mare-s-1-cover_huge.jpg");
        carte.setTitlu1("Matilda");
        carte.setAutor1("Roald Dahl");
        carte.setEditura("vizMedia");
        carte.setAn("2021");
        carte.setGen("Fictiune copii");
        carte.setPret("38 RON");
        carte.setDescriereTip("Descriere:");
        carte.setDescriere("Tatal ei e un infractor, iar mama, o femeie cicalitoare si nu tocmai inteligenta. Cei doi cred ca Matilda e o adevarata pacoste care pierde prea mult timp cu cititul in loc sa se uite la televizor, ca oamenii normali... Nici ingrozitoarea domnisoara Trunchbull, directoarea scolii, nu are o parere mai buna despre micuta pasionata de lectura.\n" +
                "Dar Matilda nu e chiar singura. Domnisoara Honey, invatatoarea ei, stie ca fetita e un geniu si ca ascunde cativa asi in maneca.");
        cartiLista.add(carte);



        carte = new CartiViz();
        carte.setPoza("/imagini/magisterium-testul-fierului-holly-black-cassandra-clare-carti-copii-editura-corint-junior.jpg");
        carte.setTitlu1("Magisterium *");
        carte.setAutor1("Holly Black si Cassandra Clare");
        carte.setEditura("globo");
        carte.setAn("2017");
        carte.setGen("Fictiune adolescenti");
        carte.setPret("42 RON");
        carte.setDescriereTip("Descriere:");
        carte.setDescriere("From NEW YORK TIMES bestselling authors Holly Black and Cassandra Clare comes a riveting new series that defies what you think you know about the world of magic.\n" +
                "\n" +
                "Most kids would do anything to pass the Iron Trial.\n" +
                "\n" +
                "Not Callum Hunt. He wants to fail.");
        cartiLista.add(carte);



        carte = new CartiViz();
        carte.setPoza("/imagini/scoala-de-magie-magisterium-manusa-de-arama-vol-2_1_fullsize.jpg");
        carte.setTitlu1("Magisterium **");
        carte.setAutor1("Holly Black si Cassandra Clare");
        carte.setEditura("globo");
        carte.setAn("2015");
        carte.setGen("Fictiune adolescenti");
        carte.setPret("42 RON");
        carte.setDescriereTip("Descriere:");
        carte.setDescriere("Pentru Callum Hunt, vacanta de iarna nu este ca pentru alti copii. Fiinta cea mai apropiata de el este un lup al haosului pe nume Havoc. Tatal lui suspecteaza ca este trimis, in secret, de fortele raului. Si, desigur, multi dintre copii nu vor reveni in lumea magica de la Magisterium din toamna.");
        cartiLista.add(carte);



        carte = new CartiViz();
        carte.setPoza("/imagini/httpswww.universenciclopedic.romediacatalogproductchcheia-de-bronz-magisterium-vol-3_1_fullsize.jpg");
        carte.setTitlu1("Magisterium ***");
        carte.setAutor1("Holly Black si Cassandra Clare");
        carte.setEditura("globo");
        carte.setAn("2017");
        carte.setGen("Fictiune adolescenti");
        carte.setPret("42 RON");
        carte.setDescriereTip("Descriere:");
        carte.setDescriere("From Holly Black and Cassandra Clare comes the third installment in the New York Times bestselling series that defies what you think you know about the worlds of good and evil.");
        cartiLista.add(carte);

        return cartiLista;

    }


    @FXML
    private Button ButonInapoi6;


    public void ButonInapoi6(ActionEvent event) throws IOException {
        intoarceFereastra6();
    }

    public void intoarceFereastra6() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Biblioteca.fxml"));

        Stage window = (Stage) ButonInapoi6.getScene().getWindow();
        window.setScene(new Scene(root,1100,593));

    }

}