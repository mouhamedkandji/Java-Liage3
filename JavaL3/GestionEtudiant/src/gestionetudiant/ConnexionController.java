/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionetudiant;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import metier.Service;
import model.Personne;

/**
 * FXML Controller class
 *
 * @author user
 */
public class ConnexionController implements Initializable {

    @FXML
    private PasswordField txtPwd;
    @FXML
    private TextField txtLogin;
    @FXML
    private Text lblError;
    private Service metier;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        lblError.setVisible(false);
        metier= new Service();
    }    

    @FXML
    private void handleConnexion(ActionEvent event) throws IOException {
        String login=txtLogin.getText(); 
        String pwd=txtPwd.getText();
       Personne personne= metier.seConnecter(login, pwd);
       if(personne==null){
           lblError.setVisible(true);
       }else{
           txtLogin.getScene().getWindow().hide();
           AnchorPane view= FXMLLoader.load(getClass().getResource("vmenu.fxml"));
           Scene scene=new Scene(view);
           Stage stage= new Stage();
           stage.setScene(scene);
           stage.showAndWait();
    }
    }
    
}
