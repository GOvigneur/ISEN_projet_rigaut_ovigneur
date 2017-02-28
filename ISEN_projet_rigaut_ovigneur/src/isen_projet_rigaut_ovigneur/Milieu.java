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
 * Allow you to create a midfielder with some stats in Shoot,Pass and Defense. The getters and setters are inherit.
 */
public class Milieu extends Joueur implements CaracteristiquesJoueurDeChamps {
    
    
     final private PosteJoueur milieu;
     final private int min=10;
    final private int max=50;
    
    /**
     * allow to instantiate a Milieu different parameters without a husband.
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
     * @param milieu: correspond au poste du joueur, ici le poste milieu
     */
    public Milieu(String nomNaissance, String prenom, String surnom, String dateNaissance, String lieuNaissance, String nationnalite, float poids, float taille,Sexe sexe1,Pied piedTir,Tenue dress,int numeroMaillot,Sponsor sponsorJoueur,PosteJoueur milieu){
        super(nomNaissance,prenom,surnom,dateNaissance,lieuNaissance,nationnalite,poids,taille,sexe1,piedTir,dress,numeroMaillot,sponsorJoueur);
        this.milieu=PosteJoueur.MILIEU;
        }
    
    
       /**
     * allow to instantiate a Milieu with different parameters and a husband
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
     * @param milieu : correspond au poste du joueur, ici le poste attaquant
     */

    public Milieu(String nomNaissance, String prenom, String surnom, String dateNaissance, String lieuNaissance, String nationnalite, float poids, float taille, Personne marie, Sexe sexe1,Pied piedTir,Tenue dress,int numeroMaillot,Sponsor sponsorJoueur,PosteJoueur milieu){
        super(nomNaissance,prenom,surnom,dateNaissance,lieuNaissance,nationnalite,poids,taille,marie,sexe1,piedTir,dress,numeroMaillot,sponsorJoueur);
        this.milieu=PosteJoueur.MILIEU;
   }
    
    
    /**
     * A midfielder has a stat in shoot. We need to override the tirer method
     */
    @Override
    public double tirer () {
      System.out.println("Un milieu a une frappe moyenne");
      statTir=20;
      statTir=statTir*Math.random();
      return statTir;
      
  } 
  /**
     * A midfielder can celebrate his goal in a specific way. We need to override the celebrer method.
     */
    @Override
 public  void celebrer() {
     System.out.println("Comme Ronaldo : SUUUUUUUU");
     
 }
 
 /**
     * A midfielder has a stat in pass. We need to override the passer method
     */
    
 
    
    @Override
    public double  passer() {
        System.out.println("Les passes d'un milieu sont magiques");
        statPasse=50;
        statPasse=statPasse*Math.random();
        return statPasse;
                
       }
    
    /**
     * A midfielder has a stat in defense. We need to override the defense method
     */
    
    @Override
   public  double defendre() {
       System.out.println("Un defenseur defend mal");
       statDefendre=10;
       statDefendre=statDefendre*Math.random();
       return statDefendre;
       
   }
     /**
     * A midfielder has a stat in running. We need to override the running method
     */
    
    @Override
   public  void courir() {
        statVitesse= min +(Math.random()*(max-min));
       System.out.println("Je cours à la vitesse de " + statVitesse);
       
   }

      /**
     * A midfielder has less or more chance to get injuries. We need to override the seBlesser method
     */
   @Override
   public double seBlesser() {
       System.out.println("AIIIEEEE");
        statBlessure=10;
       statBlessure=statBlessure*Math.random();
       return statBlessure;
       
   }
     /**
     * A midfielder  has a stat in the agression of oponent. We need to override the running method
     */
    
    @Override
   public double agression(){
       System.out.println("Grosse faute");
        statAgressivite=10;
       statAgressivite=statAgressivite*Math.random();
       return statAgressivite;
      }
   
   /**
     * get the stat of Agression
     * @return  statAgressivite
     */
   
    public double getStatAgressivite() {
        return this.statAgressivite;
        
    }
    
    /**
     * A mildfielder has a stat in stamina. We need to override the fatigue method
     * @return statFatigue
     */
    @Override
    public double fatigue() {
       statFatigue=50;
       statFatigue=statFatigue*Math.random();
       return statFatigue;
    }
    
    /**
     * get the stat of Blessure
     * @return  statBlessure
     */
   
    public double getStatBlessure() {
        return this.statBlessure;
        
    }
  
   /**
     * Gets PosteJoueur
     *
     * @return  milieu
     */
    public PosteJoueur getPosteJoueur() {
        return this.milieu;
    }
    
    
      /**
     * get the stat of Tir
     * @return  statTir
     */
   
    public double getStatTir() {
        return this.statTir;
        
    }
    
    /**
     * get the stat of Pass
     * @return  statPasse
     */
    
    public double getStatPasse()  {
        return this.statPasse;
    }
    
    
    /**
     * get the stat of Defense
     * @return  statDefendre
     */
    
    public double getStatDefense() {
        return this.statDefendre;
    }
    /**
     * get the stat of Courir
     * @return  statVitesse
     */
    public double getStatCourir() {
        return this.statVitesse;
    }
    
       /**
     * get the stat of Fatigue
     * @return statFatigue
     */
    public double getStatFatigue(){
        return this.statFatigue;
    }
   
   
}
    