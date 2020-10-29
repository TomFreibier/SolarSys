/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.solarsystem;

import java.util.ArrayList;
/**
 *
 * @author Tom
 */
public class AsteroidenGuertel {
    public int anzahl;
    public int position;
    
    private ArrayList<Rescource> rescourcen;
    
    public AsteroidenGuertel(int position, int anzahl){
        setAnzahl(anzahl);
        setPosition(position);
    }
    
    //Getter
    public int getAnzahl() {
        return anzahl;
    }

    public int getPosition() {
        return position;
    }
    
    //Setter
    public void setAnzahl(int Anzahl) {
        this.anzahl = Anzahl;
    }

    public void setPosition(int position) {
        this.position = position;
    }
    
    //ArrayList
    
    public ArrayList getRescourcen(){
        return this.rescourcen;
    }
    
    public void addRescource(Rescource newRescource){
        this.rescourcen.add(newRescource);
    }
    
    public void removeRescource(Rescource Rescource){
        this.rescourcen.remove(Rescource);
    }
    
    
}
