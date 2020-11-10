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
public class GasList {
    private ArrayList<Gas> gase;
    private ArrayList<Gas> OutputGase;
    
    public GasList(){
        
    }
    
    private Gas newGas(String typ, int menge){
        Gas NGas = new Gas(typ,menge);
        return NGas;
    }
    
    private void AddGas (String typ, int menge){
        this.gase.add(newGas(typ,menge));
    }
    
    
    private void FillGas(){
        this.gase = new ArrayList<Gas>();
        
        AddGas("Stickstoff",10);
        AddGas("Sauerstoff",50);
        AddGas("Kohlendioxid",10);
        AddGas("Edelgase",5);
        AddGas("Methan",10);
    }
    
    
    //Das ist der Randomiser
    public ArrayList GetLocalGase(int Min, int Max){
        this.OutputGase = new ArrayList<Gas>();
        
        int GasNumber = Min + (int)(Math.random() * ((Max - Min) + 1));
        
        while(GasNumber > 0){
            FillGas();
            
            //Random Index
            int IMin = 0;
            int IMax = 4;
            int index = IMin + (int)(Math.random() * ((IMax - IMin) + 1));
            
            Gas nGas = this.gase.get(index);
            this.gase.remove(index);
            
            //Random Menge
            IMin = 1;
            Max = 5;
            int nMenge = IMin + (int)(Math.random() * ((IMax - IMin) + 1));
            
            int FinalMenge = nGas.getMenge() * nMenge;
            
            nGas.setMenge(FinalMenge);
            
            //Output
            this.OutputGase.add(nGas);
            
            GasNumber -= 1;
        }
      
        return this.OutputGase;
    }
}
