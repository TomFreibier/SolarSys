/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.solarsystem;

import java.util.Random;
import java.util.ArrayList;
/**
 *
 * @author Tom
 */
public class Planet {
    public int groeße;
    public int masse;
    public int gravitation;
    public int temperatur;
    public int bewohnbarkeit;
    public int position;
    
    private ArrayList<Rescource> rescourcen;
    private ArrayList<Gas> gase;
    
    public Planet(int position, int groeße, int masse, int gravitation, int temperatur, int bewohnbarkeit){
        setGroeße(groeße);
        setMasse(masse);
        setGravitation(gravitation);
        setTemperatur(temperatur);
        setBewohnbarkeit(bewohnbarkeit);
        setPosition(position);
        
        this.rescourcen = new ArrayList<Rescource>();
        this.gase = new ArrayList<Gas>();
    }
    
    public int randomTemp(){
        int Min = 1;
        int Max = 10;
        
        int Wert = Min + (int)(Math.random() * ((Max - Min) + 1));
        return Wert;
    }
    public int randomBewohn(){
     int Min = 1;
        int Max = 10;
        
        int Wert = Min + (int)(Math.random() * ((Max - Min) + 1));
        return Wert;
    }
    public int randomGroeße(){
     int Min = 1;
        int Max = 10;
        
        int Wert = Min + (int)(Math.random() * ((Max - Min) + 1));
        return Wert;
    }
    public int randomMasse(){
     int Min = 1;
        int Max = 10;
        
        int Wert = Min + (int)(Math.random() * ((Max - Min) + 1));
        return Wert;
    }
    public int randomGravitation(){
        int Min = 1;
        int Max = 10;
        
        int Wert = Min + (int)(Math.random() * ((Max - Min) + 1));
        return Wert;
    }
   
    public int randomPosition(){
        int Min = 1;
        int Max = 10;
        
        int position = Min + (int)(Math.random() * ((Max - Min) + 1));
        return position;
     
    }
    //Getter
    public int getGroeße() {
        return groeße;
    }

    public int getMasse() {
        return masse;
    }

    public int getGravitation() {
        return gravitation;
    }

    public int getTemperatur() {
        return temperatur;
    }

    public int getBewohnbarkeit() {
        return bewohnbarkeit;
    }

    public int getPosition() {
        return position;
    }
    
    
    //Setter
    public void setGroeße(int groeße) {
        this.groeße = groeße;
    }

    public void setMasse(int masse) {
        this.masse = masse;
    }

    public void setGravitation(int gravitation) {
        this.gravitation = gravitation;
    }

    public void setTemperatur(int temperatur) {
        this.temperatur = temperatur;
    }

    public void setBewohnbarkeit(int bewohnbarkeit) {
        this.bewohnbarkeit = bewohnbarkeit;
    }

    public void setPosition(int position) {
        this.position = position;
    }
    
    
    
    //Array
    
    //Rescource
    public ArrayList getRescourcen(){
        return this.rescourcen;
    }
    
    public void addRescource(Rescource newRescource){
        this.rescourcen.add(newRescource);
    }
    
    public void removeRescource(Rescource Rescource){
        this.rescourcen.remove(Rescource);
    }
    
    //Gas
    public ArrayList getGase(){
        return this.gase;
    }
    
    public void addGas(Gas newGas){
        this.gase.add(newGas);
    }
    
    public void removeGas(Gas Gas){
        this.gase.remove(Gas);
    }
    
    
}
