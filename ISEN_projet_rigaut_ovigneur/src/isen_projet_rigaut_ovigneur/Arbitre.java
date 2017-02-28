/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isen_projet_rigaut_ovigneur;
import java.util.Random;

/**
 *
 * @author ISEN
 * Create an Arbitre
 */
public class Arbitre extends Personne {
      /**
     * allow to instantiate a Referee different parameters 
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
     */

    
      public Arbitre(String nomNaissance, String prenom, String surnom, String dateNaissance, String lieuNaissance, String nationnalite, float poids, float taille,Sexe sexe1) {
        super(nomNaissance, prenom, surnom, dateNaissance, lieuNaissance, nationnalite, poids, taille,sexe1);
   
      }
      
      /**
       * 
       * @param discours : the things we want to say
       */
       public void exprimer(String discours) {
        System.out.println("L'arbitre " + super.getPrenom() + "  " + super.getNom()+"  " + "dit:   " + discours);
    }
      
     /**
     * Indique si l'aribtre siffle faute ou non

     * @return the boolean:if faute=return true, else return false
     */ 
      public boolean siffleFaute(){
          Random nombre=new Random();
          int faute=nombre.nextInt(50);
          if (faute<20) {
              return true;
          }
          else {
              return false;
          }
           }
           }
      

