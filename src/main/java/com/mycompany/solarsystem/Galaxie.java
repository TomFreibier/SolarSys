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
public class Galaxie {
    private ArrayList<System> systeme;
    
    public Galaxie(){
        this.systeme = new ArrayList<System>();
    }
    
    public ArrayList getSysteme(){
        return this.systeme;
    }
    
    public void addSystem(System newSystem){
        this.systeme.add(newSystem);
    }
    
    public void removeSystem(System System){
        this.systeme.remove(System);
    }
    
}
