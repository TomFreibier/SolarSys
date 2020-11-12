/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.solarsystem;

import java.util.Random;

/**
 *
 * @author Tom
 */
public final class Stern {
    public int leuchtkraft;
    public String typ;
    public int groeße;
    public int position;
    
    public Stern(int position, String typ, int leuchtkraft, int groeße ){
        setPosition(position);
        setTyp(typ);
        setLeuchtkraft(leuchtkraft);
        setGroeße(groeße);
    }

    
    
    public int randomLeuchtkraft(){
        int Min = 1;
        int Max = 10;
        
        int Wert = Min + (int)(Math.random() * ((Max - Min) + 1));
        return Wert;
    }
    public String randomTyp(){
        String Wert = "Planet";
        return Wert;
    }
    
    public int randomGroeße(){
        int Min = 1;
        int Max = 10;
        
        int Wert = Min + (int)(Math.random() * ((Max - Min) + 1));
        return Wert;
    }
    public int randomPosition(){
        int Min = 1;
        int Max = 10;
        
        int Wert = Min + (int)(Math.random() * ((Max - Min) + 1));
        return Wert;
    }
    
    //Getter
    public int getLeuchtkraft() {
        return leuchtkraft;
    }

    public String getTyp() {
        return typ;
    }

    public int getGroeße() {
        return groeße;
    }

    public int getPosition() {
        return position;
    }

    //Setter
    public void setLeuchtkraft(int leuchtkraft) {
        this.leuchtkraft = leuchtkraft;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public void setGroeße(int groeße) {
        this.groeße = groeße;
    }

    public void setPosition(int position) {
        this.position = position;
    }
    
    
}
