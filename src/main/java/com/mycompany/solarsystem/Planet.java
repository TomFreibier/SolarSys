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
    
    public Planet( int position, int groeße, int masse, int gravitation, int temperatur, int bewohnbarkeit){
        setGroeße(groeße);
        setMasse(masse);
        setGravitation(gravitation);
        setTemperatur(temperatur);
        setBewohnbarkeit(bewohnbarkeit);
        setPosition(position);
        
        this.rescourcen = new ArrayList<Rescource>();
        this.gase = new ArrayList<Gas>();
    }
    
    public static void randomTemp(String args[]){
     Random temperatur = new Random();
     int t = temperatur.nextInt(10)+1;
        System.out.println(t);
    }
    public static void randomBewohn(String args[]){
     Random bewohnbarkeit = new Random();
     int b = bewohnbarkeit.nextInt(10)+1;
     System.out.println(b);
    }
    public static void randomGroeße(String args[]){
     Random groeße = new Random();
     int g = groeße.nextInt(10)+1;
     System.out.println(g);
    }
    public static void randomMasse(String args[]){
     Random masse = new Random();
     int m = masse.nextInt(10)+1;
     System.out.println(m);
    }
    public static void randomGravitation(String args[]){
     Random gravitation = new Random();
     int g = gravitation.nextInt(10)+1;
     System.out.println(g);
    }
   
    public static void randomPosition(String args[]){
     Random position = new Random();
     int laenge = position.nextInt();
     int breite = position.nextInt();
     System.out.println(laenge + " " + breite );
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
