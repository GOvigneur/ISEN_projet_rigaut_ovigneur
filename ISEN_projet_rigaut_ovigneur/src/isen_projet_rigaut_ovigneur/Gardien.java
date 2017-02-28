/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isen_projet_rigaut_ovigneur;


/**
 *
 * @author ISEN
 * 
 * Allow you to create a Goalkeeper with some method inherit from an interface. The getters and setters are inherit. 
 */
public class Gardien extends Joueur implements CaracteristiquesGardien {
    
    private double statParade;
    
    
    /**
     * allow to instantiate a GoalKeeper different parameters without a husband.
     *
     * @param nomNaissance: nom de Naissance
     * @param sexe1: sexe du joueur.
     * @param prenom : prenom
     * @param surnom: surnom
     * @param dateNaissance : date de Naissance
     * @param lieuNaissance : lieu de Naissance
     * @param nationnalite : nationalite
     * @param taille : taille
     * @param poids :poids
     * @param piedTir : correspond au bon pied de notre joueur.
     * @param dress   : correspond à la tenue de notre joueur.
     * @param numeroMaillot:correspond au numéro du maillot.
     * @param sponsorJoueur: correspond au sponsor du joueur.
  */
    public Gardien(String nomNaissance, String prenom, String surnom, String dateNaissance, String lieuNaissance, String nationnalite, float poids, float taille,Sexe sexe1,Pied piedTir,Tenue dress,int numeroMaillot,Sponsor sponsorJoueur){
        super(nomNaissance,prenom,surnom,dateNaissance,lieuNaissance,nationnalite,poids,taille,sexe1,piedTir,dress,numeroMaillot,sponsorJoueur);
        
        }
    
    
       /**
     * allow to instantiate a GoalKeeper with different parameters and a husband
     *
     * @param nomNaissance: nom de Naissance
     * @param sexe1: sexe du joueur.
     * @param prenom : prenom
     * @param surnom: surnom
     * @param dateNaissance : date de Naissance
     * @param lieuNaissance : lieu de Naissance
     * @param nationnalite : nationalite
     * @param taille : taille
     * @param poids :poids
     * @param marie : correspond au conjoint de la Personne qu'on est en train de creer.
     * @param piedTir : correspond au bon pied de notre joueur.
     * @param dress   : correspond à la tenue de notre joueur.
     * @param numeroMaillot:correspond au numéro du maillot.
     * @param sponsorJoueur: correspond au sponsor du joueur.
   */

    public Gardien(String nomNaissance, String prenom, String surnom, String dateNaissance, String lieuNaissance, String nationnalite, float poids, float taille, Personne marie, Sexe sexe1,Pied piedTir,Tenue dress,int numeroMaillot,Sponsor sponsorJoueur ){
        super(nomNaissance,prenom,surnom,dateNaissance,lieuNaissance,nationnalite,poids,taille,marie,sexe1,piedTir,dress,numeroMaillot,sponsorJoueur);
        
   }
      /**
     * A goalKeeper has a stat in saving. 
     * @return the save stat
     */
    @Override
    public double parade () {
        statParade=50;
        System.out.println("La parade du gardien !" + statParade);
        statParade=statParade*Math.random();
        return statParade;
        
    }
    
      /**
     * A goalKeeper can push his team because he's the captain
     */
    @Override
     public void faireMonter() {
        System.out.println("On y va les gars");
     }
    
      /**
     * If a striker is alone, he can go and search the ball in the player's legs.
     */
    @Override
     public void  sortir() {
         System.out.println("Je sors dans le pied du joueur adverse");
        
         
     }
    
    
    
    
   
   }
    
    