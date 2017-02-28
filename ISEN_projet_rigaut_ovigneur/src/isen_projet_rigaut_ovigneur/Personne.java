/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isen_projet_rigaut_ovigneur;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Paul,Guillaume Allow us to create a Personne.
 */
public abstract class Personne {

    private String nomNaissance;
    private  String nomCourant;
    private  String prenom;
    private  String surnom;
    private  String dateNaissance;
    private String lieuNaissance;
    private  String nationnalite;
    public  float taille;
    protected  float poids;
    private Personne marie;
    private Sexe sexe1;

    /**
     * it's the default constructor of the type Personne.
     */
    public Personne() {

    }

    /**
     * allow to instantiate a Personnne with different parameters with a husband
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
     * @param marie : correspond au conjoint de la Personne qu'on est en train
     * de creer.
     */
    public Personne(String nomNaissance, String prenom, String surnom, String dateNaissance, String lieuNaissance, String nationnalite, float poids, float taille, Personne marie, Sexe sexe1) {
        this.nomNaissance = nomNaissance;
        this.nationnalite = nationnalite;
        this.prenom = prenom;
        this.surnom = surnom;
        this.taille = taille;
        this.poids = poids;
        this.dateNaissance = verifieDate(dateNaissance);
        this.lieuNaissance = lieuNaissance;
        this.marie = marie;
        this.sexe1 = sexe1;
        this.setNomCourant();

    }
    
    
    
    /**
     * allow to instantiate a Personnne with different parameters and without a husband
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
    public Personne(String nomNaissance, String prenom, String surnom, String dateNaissance, String lieuNaissance, String nationnalite, float poids, float taille,Sexe sexe1) {
        this.nomNaissance = nomNaissance;
        this.nationnalite = nationnalite;
        this.prenom = prenom;
        this.surnom = surnom;
        this.taille = taille;
        this.poids = poids;
        this.dateNaissance = verifieDate(dateNaissance);
        this.lieuNaissance = lieuNaissance;
        this.sexe1 = sexe1;
        

    }

    /**
     * permet de savoir si la personne a un nom courant c'est a dire si c'est
     * une femme et qu'elle est mariee
     */
    private void setNomCourant() {
        if (this.sexe1 == Sexe.FEMME && this.marie != null) {
            this.nomCourant = this.marie.nomNaissance;
        } else {
            this.nomCourant = null;
        }
    }

    /**
     * Gets nom naissance.
     *
     * @return nom de naissance
     */
    public String getNomNaissance() {
        return this.nomNaissance;
    }

    /**
     * Gets prenom.
     *
     * @return prenom
     */
    public String getPrenom() {
        return this.prenom;
    }

    /**
     * Gets surnom.
     *
     * @return surnom
     */
    public String getSurnom() {
        return this.surnom;
    }

    /**
     * Gets lieu naissance.
     *
     * @return lieu de naissance
     */
    public String getLieuNaissance() {
        return this.lieuNaissance;
    }

    /**
     * Sets surnom.
     *
     * @param surnom surnom
     */
    public void setSurnom(String surnom) {
        this.surnom = surnom;
    }

    /**
     * Gets date naissance.
     *
     * @return date de naissance
     */
    public String getDateNaissance() {
        return this.dateNaissance;
    }

    /**
     * Gets nationalite.
     *
     * @return nationalite
     */
    public String getNationalite() {
        return this.nationnalite;
    }

    /**
     * Sets nationalite.
     *
     * @param nationalite nationalite
     */
    public void setNationalite(String nationalite) {
        this.nationnalite = nationalite;
    }

    /**
     * Gets taille.
     *
     * @return taille
     */
    public float getTaille() {
        return this.taille;
    }

    /**
     * Sets taille.
     *
     * @param taille taille
     */
    public void setTaille(float taille) {
        this.taille = taille;
    }

    /**
     * Gets poids.
     *
     * @return poids
     */
    public float getPoids() {
        return this.poids;
    }

    /**
     * Sets poids.
     *
     * @param poids poids
     */
    public void setPoids(float poids) {
        this.poids = poids;
    }

    /**
     * Gets genre.
     *
     * @return genre
     */
    public Sexe getSexe() {
        return this.sexe1;
    }



    /**
     * Gets partenaire.
     *
     * @return partenaire
     */
    public Personne getPartenaire() {
        return this.marie;
    }

    /**
     * Sets partenaire.
     *
     * @param compagnon
     */
    public void setPartenaire(Personne compagnon) {
        this.marie = compagnon;
    }

    /**
     * Gets nom.
     *
     * @return nom
     */
    public String getNom() {
        if (this.nomCourant != null) {
            return this.nomCourant;
        } else {
            return this.nomNaissance;
        }
    }
    
    
    
      /**
     * Sets sexe for the spectator.
     *
     * @param newSexe new genre
     */
    public void setSexe(Sexe newSexe) {
        this.sexe1= newSexe;
    }
      /**
     * Check if the string DateNaissance is in the good format with an ParseException test
     *@param dateNaissance : date de naissance qu'on veut tester
     * @exception ParseException e 
     * @return dateNaissance
     */
    
    public String verifieDate(String dateNaissance)  {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
try {
   dateFormat.parse(dateNaissance);
} catch (ParseException e) {
   System.out.println("Veuillez entrer une date sous la forme dd/MM/yyyy  ");     // a tester avec un joueur car non abstract
   e.printStackTrace();
}
return dateNaissance;
    }
    
    

}
