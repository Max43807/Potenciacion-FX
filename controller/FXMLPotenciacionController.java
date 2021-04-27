/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package potenciacionfx.controller;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
/**
 *
 * @author Maxi
 */
public class FXMLPotenciacionController implements Initializable {

    @FXML
    private Button btnCalcular;
    @FXML
    private TextField txfResultado;
    @FXML
    private TextField txfBase;
    @FXML
    private TextField txfExponente;
    @FXML
    private Button btnLimpiar;
    @FXML
    private ImageView imageEj;
    

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Calcular_OnAction(ActionEvent event) {
        double Potencia;
        String Dato = txfBase.getText();
        double Base = Double.parseDouble(Dato);
        DecimalFormat formatear = new DecimalFormat("#,###.0000");
        String Dato1 = txfExponente.getText();
        double Expo = Double.parseDouble(Dato1);
        Potencia = Math.pow(Base, Expo);
        txfResultado.setText(formatear.format(Potencia));
                
        
    }
        
    @FXML
    private void Limpiar_OnAction(ActionEvent event) {
        txfBase.setText("");
        txfExponente.setText("");
        txfResultado.setText("");
        
    }
    
}
