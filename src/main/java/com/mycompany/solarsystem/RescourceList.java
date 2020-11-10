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
public class RescourceList {
    private ArrayList<Rescource> rescourcen;
    private ArrayList<Rescource> OutputRescourcen;
    
    public RescourceList(){
        
    }
    
    private Rescource newRescource(String typ, int menge){
        Rescource NRescource = new Rescource(typ,menge);
        return NRescource;
    }
    
    private void AddRescource (String typ, int menge){
        this.rescourcen.add(newRescource(typ,menge));
    }
    
    private void FillList(){
        this.rescourcen = new ArrayList<Rescource>();
        
        AddRescource("Wasser",200);
        AddRescource("Metall",100);
        AddRescource("Erdgas",10);
        AddRescource("Edelsteine",5);
        AddRescource("Seltene Erden",5);
    }
    
    
     //Das ist der Randomiser
    public ArrayList GetLocalRescources(int Min, int Max){
        this.OutputRescourcen = new ArrayList<Rescource>();
        
        int RescourceNumber = Min + (int)(Math.random() * ((Max - Min) + 1));
        
        while(RescourceNumber > 0){
            FillList();
            
            //Random Index
            int IMin = 0;
            int IMax = 4;
            int index = IMin + (int)(Math.random() * ((IMax - IMin) + 1));
            
            Rescource nRescource = this.rescourcen.get(index);
            this.rescourcen.remove(index);
            
            //Random Menge
            IMin = 1;
            Max = 5;
            int nMenge = IMin + (int)(Math.random() * ((IMax - IMin) + 1));
            
            int FinalMenge = nRescource.getMenge() * nMenge;
            
            nRescource.setMenge(FinalMenge);
            
            //Output
            this.OutputRescourcen.add(nRescource);
            
            RescourceNumber -= 1;
        }
      
        return this.OutputRescourcen;
    }
    
    
    
    
    
    
    
}
