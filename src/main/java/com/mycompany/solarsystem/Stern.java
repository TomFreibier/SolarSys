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

    
    
    public static void randomLeuchtkraft(int args[]){
     Random leuchtkraft = new Random();
     int l = leuchtkraft.nextInt(10)+1;
        System.out.println(l);
    }
    public static void randomTyp(String args[]){
     Random typ = new Random();
     int t = typ.nextInt(10)+1;
        System.out.println(t);
    }
    
    public static void randomGroeße(int args[]){
     Random groeße = new Random();
     int g = groeße.nextInt(10)+1;
        System.out.println(g);
    }
    public static void randomPosition(int args[]){
     Random position = new Random();
     int laenge = position.nextInt();
     int breite =position.nextInt();
        System.out.println(laenge + " " + breite);
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
