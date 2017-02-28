/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isen_projet_rigaut_ovigneur;

/**
 *
 * This interface allow  us to set some action for the GoalKeeper on the ground.
 */
public interface CaracteristiquesGardien {
    /**
     * This method is set a stat in a save  
     * @return parade stat
     */
    
    double parade();
    
    /**
     * This method is for push the equip when the time is over
     */
    
    
    void faireMonter();
    
    /**
     * This method is for let the goalkeeper out of his goal.
     */
    
    
    void sortir();
    
    
    
}
