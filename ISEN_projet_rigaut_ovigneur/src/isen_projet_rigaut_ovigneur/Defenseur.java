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
 * Allow you to create a Defender with some stats in Shoot,Pass and Defense. The getters and setters are inherit. The post need to be defenseur
 */
public class Defenseur extends Joueur implements CaracteristiquesJoueurDeChamps {
    
    
    final public PosteJoueur defenseur;
    final private int min=10;
    final private int max=50;
    
    /**
     * allow to instantiate a Defenseur with different parameters without a husband.
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
     * @param defenseur: correspond au poste du joueur, ici le poste defendeur
     */
    public Defenseur(String nomNaissance, String prenom, String surnom, String dateNaissance, String lieuNaissance, String nationnalite, float poids, float taille,Sexe sexe1,Pied piedTir,Tenue dress,int numeroMaillot,Sponsor sponsorJoueur,PosteJoueur defenseur){
        super(nomNaissance,prenom,surnom,dateNaissance,lieuNaissance,nationnalite,poids,taille,sexe1,piedTir,dress,numeroMaillot,sponsorJoueur);
        this.defenseur=PosteJoueur.DEFENSEUR;
        }
    
    
       /**
     * allow to instantiate a Defenseur with different parameters and a husband
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
     * @param defenseur: correspond au poste du joueur, ici le poste defenseur
     */

    public Defenseur(String nomNaissance, String prenom, String surnom, String dateNaissance, String lieuNaissance, String nationnalite, float poids, float taille, Personne marie, Sexe sexe1,Pied piedTir,Tenue dress,int numeroMaillot,Sponsor sponsorJoueur,PosteJoueur defenseur){
        super(nomNaissance,prenom,surnom,dateNaissance,lieuNaissance,nationnalite,poids,taille,marie,sexe1,piedTir,dress,numeroMaillot,sponsorJoueur);
        this.defenseur=PosteJoueur.DEFENSEUR;
   }
    
   
    
    
    /**
     * A defenseur has a stat in shoot. We need to override the tirer method
     */
    @Override
    public double  tirer () {
       statTir=10;
      statTir=statTir*Math.random();
      System.out.println("Un tir dans les tribunes, UN");
      return statTir;
      
      
  } 
  /**
     * A defenseur can celebrate his goal in a specific way. We need to override the celebrer method.
     */
    @Override
 public  void celebrer() {
     System.out.println("ALLLLLEZZZ LAAAA");
     
 }
 
 /**
     * A defenseur has a stat in pass. We need to override the passer method
     */
    
 
    
    @Override
    public double  passer() {
        this.statPasse=20;
        System.out.println("Les passes d'un defenseur sont moyennes"+ this.statPasse);
        this.statPasse=this.statPasse*Math.random();
        return(this.statPasse);
        
                
       }
    
    /**
     * A defenseur has a stat in defense. We need to override the defense method
     */
    
    @Override
   public  double defendre() {
       System.out.println("Grosse defense");
       statDefendre=50;
       statDefendre=statDefendre*Math.random();
       return statDefendre;
       
   }
     /**
     * A striker has a stat in running. We need to override the running method
     */
    
    @Override
   public  void courir() {
       statVitesse= min +(Math.random()*(max-min));
       System.out.println("Je cours à la vitesse de " + statVitesse);
       
       }
   
      /**
     * A defender has less or more chance to get injuries. We need to override the seBlesser method
     */
   @Override
   public double seBlesser() {
       System.out.println("AIIIEEEE");
        statBlessure=10;
       statBlessure=statBlessure*Math.random();
       return statBlessure;
       
   }
     /**
     * A defender has a stat in the agression of oponent. We need to override the running method
     */
    
    @Override
   public double agression(){
       
        statAgressivite=10;
       statAgressivite=statAgressivite*Math.random();
       return statAgressivite;
      }
   
        /**
     * A defender has a stat in stamina. We need to override the fatigue method
     * @return statFatigue
     */
    @Override
    public double fatigue() {
       statFatigue=10;
       statFatigue=statFatigue*Math.random();
       return statFatigue;
    }
   
    
   
   /**
     * Gets PosteJoueur
     *
     * @return  attaquant
     */
    public PosteJoueur getPosteJoueur() {
        return this.defenseur;
    }
   /**
     * get the stat of Agression
     * @return  statAgressivite
     */
   
    public double getStatAgressivite() {
        return this.statAgressivite;
        
    }
    /**
     * get the stat of Blessure
     * @return  statBlessure
     */
   
    public double getStatBlessure() {
        return this.statBlessure;
        
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
    
    