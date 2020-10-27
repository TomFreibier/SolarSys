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
public class System {
    private ArrayList<Stern> sterne;
    private ArrayList<AsteroidenGuertel> asteroidenGuertel;
    private ArrayList<Planet> planeten;
    
    public System(){
        this.sterne = new ArrayList<Stern>();
        this.asteroidenGuertel = new ArrayList<AsteroidenGuertel>();
        this.planeten = new ArrayList<Planet>();
    }
    
    public ArrayList getSterne(){
        return this.sterne;
    }
    
    public void addStern(Stern newStern){
        this.sterne.add(newStern);
    }
    
    public void removeStern(Stern Stern){
        this.sterne.remove(Stern);
    }
    
    public ArrayList getAsteroidenGuertel(){
        return this.asteroidenGuertel;
    }
    
    public void addAsteroidenGuertel(AsteroidenGuertel newAsteroidenGuertel){
        this.asteroidenGuertel.add(newAsteroidenGuertel);
    }
    
    public void removeAsteroidenGuertel(AsteroidenGuertel AsteroidenGuertel){
        this.asteroidenGuertel.remove(AsteroidenGuertel);
    }
    
    public ArrayList getPlanet(){
        return this.planeten;
    }
    
    public void addPlanet(Planet newPlanet){
        this.planeten.add(newPlanet);
    }
    
    public void removePlanet(Planet Planet){
        this.planeten.remove(Planet);
    }
    
    
}
