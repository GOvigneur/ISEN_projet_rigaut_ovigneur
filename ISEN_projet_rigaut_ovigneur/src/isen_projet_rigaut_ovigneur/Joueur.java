/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isen_projet_rigaut_ovigneur;

import java.util.Random;



/**
 *
 * @author Paul,Guillaume 
 * Allow us to create a Joueur.
 */
public class Joueur extends Personne  implements AssisteMatch  {
    
    private  Pied piedTir;
    private Tenue dress;
    private int numeroMaillot;
    private Sponsor sponsorJoueur;
    protected double statTir;
    protected double statPasse;
    protected double  statDefendre;
    protected double statVitesse;
    protected double statBlessure;
    protected double statAgressivite;
    protected double statFatigue;
    protected int cartonJaune=0;

    
     /**
     * allow to instantiate a Player different parameters without a husband.
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

    
      public Joueur(String nomNaissance, String prenom, String surnom, String dateNaissance, String lieuNaissance, String nationnalite, float poids, float taille,Sexe sexe1,Pied piedTir,Tenue dress,int numeroMaillot,Sponsor sponsorJoueur) {
        super(nomNaissance, prenom, surnom, dateNaissance, lieuNaissance, nationnalite, poids, taille,sexe1);
        this.piedTir=piedTir;
        this.dress=dress;
        try {
             this.numeroMaillot=numeroMaillot;
             verifieNumeroMaillot(this.numeroMaillot);
             
        }
        catch( NumeroMaillotException f ) {
            f.printStackTrace();
            
        }
        this.sponsorJoueur=sponsorJoueur;
        }
    
    
    
    /**
     * allow to instantiate a Player with different parameters and a husband
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

    public Joueur(String nomNaissance, String prenom, String surnom, String dateNaissance, String lieuNaissance, String nationnalite, float poids, float taille, Personne marie, Sexe sexe1,Pied piedTir,Tenue dress,int numeroMaillot,Sponsor sponsorJoueur) {
        super(nomNaissance, prenom, surnom, dateNaissance, lieuNaissance, nationnalite, poids, taille, marie, sexe1);
        this.piedTir=piedTir;
        this.dress=dress;
        try {
             this.numeroMaillot=numeroMaillot;
            verifieNumeroMaillot(this.numeroMaillot);
             
        }
        catch( NumeroMaillotException f ) {
            f.printStackTrace();
            
        }
        this.sponsorJoueur=sponsorJoueur;
        }
    
   
    /**This method allow us to have a number on the jersey between 1 and 99
     * 
     * @param numeroMaillot : number of the jersey we want to test.
     * @throws NumeroMaillotException : cette methode est suceptible de lever cette exception
     */
   
 public  void verifieNumeroMaillot(int numeroMaillot) throws NumeroMaillotException  {
    
     if (this.numeroMaillot >99 || this.numeroMaillot<1) {
         throw new  NumeroMaillotException (); 
          
     }
     
 }

  /**
     * Gets PiedTir 
     *
     * @return PiedTir
     */
 public Pied getPiedTir() {
        return piedTir;
    }
 /**
     * Gets dress
     *
     * @return dress
     */
    public Tenue getDress() {
        return dress;
    }
    
     /**
     * Gets numeroMaillot
     *
     * @return numeroMaillot
     */

    public int getNumeroMaillot() {
        return numeroMaillot;
    }

     /**
     * Gets SponsorJoueur
     *
     * @return SponsorJoueur
     */
    public Sponsor getSponsorJoueur() {
        return sponsorJoueur;
    }
    
     /**
     * Sets Dress
     *
     * @param dress
     */

    public void setDress(Tenue dress) {
        this.dress = dress;
    }
    
     /**
     * Sets numeroMaillot
     *
     * @param numeroMaillot
     */

    public void setNumeroMaillot(int numeroMaillot) {
        this.numeroMaillot = numeroMaillot;
    }
    
     /**
     * Sets sponsorJoueur
     *
     * @param sponsorJoueur
     */

    public void setSponsorJoueur(Sponsor sponsorJoueur) {
        this.sponsorJoueur = sponsorJoueur;
    }
    
    /**
     *  overriding of the crier fonction for a player
     */
    

    @Override
    public void crier(){
    System.out.print("Allez allez, les bleus les blancs de l'Aviron ");

}
    /**
     *   overriding of the encourager fonction for a player
     */
    @Override
    public void encourager() {
        System.out.println("TIRE TIRE TIRE");
    }
    /**
     *   overriding of the pleurer fonction for a player
     */
    @Override
    public void pleurer() {
        System.out.println("SNIF SNIF SNIF");
    }
    /**
     *   overriding of the dormir fonction for a player
     */
    @Override
    public void dormir() {
        System.out.println("ZZZZZZZ");
    }
    
    public double getTirer() {
        return statTir;
    }
    
     /**
     * This function set all the stat to 0 if the player get a red card ou get injured.
     */
     public  void remiseZero() {
        this.statVitesse=0;
        this.statDefendre=0;
        this.statPasse=0;
        this.statTir=0;
        this.statAgressivite=0;
        System.out.println("Le joueur sort du terrain");
    }
    

       public int getCartonJaune(){
           return this.cartonJaune;
}
       public void incrementCartonJaune(){
           this.cartonJaune++;
       }
    
 
}

    
    
    


 
    
