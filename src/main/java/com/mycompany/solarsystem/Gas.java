/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.solarsystem;

/**
 *
 * @author Tom
 */
public class Gas {
    public String typ;
    public int menge;
    
    public Gas(String typ, int menge) {
        this.typ = typ;
        this.menge = menge;
    }
    
    //Getter

    public String getTyp() {
        return typ;
    }

    public int getMenge() {
        return menge;
    }
    
    //Setter

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public void setMenge(int menge) {
        this.menge = menge;
    }
    
    
    
}
