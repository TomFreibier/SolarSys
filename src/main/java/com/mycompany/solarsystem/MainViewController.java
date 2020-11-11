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
import java.util.*;

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
    
    public void btnNewPlanet(int index, Planet p){
       ArrayList<Sonnensystem> XSystem = App.getGalaxie().getSysteme();
       Sonnensystem ASystem = XSystem.get(index);
       ASystem.newPlanet(p.randomPosition(), p.randomGroeße(),p.randomMasse(),p.randomGravitation(),p.randomTemp(), g.randomBewohn());
    }
    
    public void btnNewStern(int index, Stern s){
       ArrayList<Sonnensystem> XSystem = App.getGalaxie().getSysteme();
       Sonnensystem ASystem = XSystem.get(index);
       
       ASystem.newStern(s.randomLeuchtkraft(), s.randomTyp(), s.randomGroeße(), s.randomPosition(), s.randomPosition());
       
    }
    
    public void btnNewSystem(ActionEvent event) throws IOException{
        App.setRoot("CreateSystemView");
    }
    
    public void btnTravel(){
       App.getGalaxie().getSysteme();
    }
    
   public void btnExit(){
       System.exit(0);
   
    }
       
       
    
}
