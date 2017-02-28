/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isen_projet_rigaut_ovigneur;

/**
 *
 * This interface allow  us to set some stats for the player on the ground.
 */
public interface CaracteristiquesJoueurDeChamps{
    /**
     * This method is for a celebration when a goal is scored
     */
    
    void celebrer();
    
    /**
     * This method is for shoot on the goal
     * @return double, the stat of shoot
     */
    
    double tirer();
    
    /**
     * This method is for pass the ball
     * @return double, the stat of pass
     */
    
    double passer();
    
    /**
     * This method is for defend on the ball
     * @return double, the stat of defense
     */
    
    double defendre();
    
     /**
     * This method is for injury a player
     * @return double, the stat of injury
     */
    double seBlesser();
    
     /**
     * This method is for the mood of the player
     * @return double, the stat of agressivity
     */
    double agression();
    
    
    /**
     * This method is for run
     */
    void courir();
    
   
    double fatigue();
    
    
  }
