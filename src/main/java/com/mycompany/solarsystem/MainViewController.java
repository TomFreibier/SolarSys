package com.mycompany.solarsystem;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import java.io.IOException;
import javafx.fxml.FXML;

/**
 * FXML Controller class
 *
 * @author akrog
 */
public class MainViewController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    @FXML
    public void btnSwitchToOptions(ActionEvent event) throws IOException{
        App.setRoot("OptionsView");
    }
    
}
