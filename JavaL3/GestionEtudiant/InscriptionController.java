/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionetudiant;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import metier.Service;
import model.Classe;
import model.Etudiant;

/**
 * FXML Controller class
 *
 * @author user
 */
public class InscriptionController implements Initializable {
    private Service metier;
    ObservableList<Classe> obClasses;
    
    @FXML
    private ComboBox<Classe> cmbClasse;
    @FXML
    private TextField txtNom;
    @FXML
    private TextField txtPrenom;
    @FXML
    private TextField txtTuteur;
    @FXML
    private Button handleLoadInscrire;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        metier=new Service();
        //chargement de l'observableList à partir de List de classe
        obClasses=FXCollections.observableArrayList(metier.listerClasse());
        cmbClasse.setCellValue(new PropertyValueFactory("libelle"));
    }    

    @FXML
    private void handleLoadInscrire(ActionEvent event) {
    }
    
}
