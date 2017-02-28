/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compet;

import isen_projet_rigaut_ovigneur.*;
import java.util.Scanner;



/**
 *
 * @author ISEN
 */
public class ISEN_projet_rigaut_ovigneur {

 
    public static void main(String[] args) {
        
        //Joueur zidane=new Joueur("zidane","zinedine","zizou", "12/07/1995","marseille","francais",75.5f,1.82f, Sexe.HOMME,Pied.AMBIDEXTRE,Tenue.SHORT,34,Sponsor.FLY_EMIRATES);
        // Attaquant messi=new Attaquant("zidane","zinedine","zizou", "12/07/1995","marseille","francais",75.5f,1.82f, Sexe.HOMME,Pied.AMBIDEXTRE,Tenue.SHORT,10,Sponsor.FLY_EMIRATES,PosteJoueur.DEFENSEUR);
         //Milieu xavi=new Milieu("xavi","xava","go", "12/07/1990","barcelone","espagnol",78.5f,1.85f, Sexe.HOMME,Pied.DROIT,Tenue.JOGGING,15,Sponsor.FLY_EMIRATES,PosteJoueur.DEFENSEUR);
         //Defenseur ramos=new Defenseur("xavi","ramos","ifjiej", "18/07/1990","madrid","espagnol",78.5f,1.88f, Sexe.HOMME,Pied.GAUCHE,Tenue.SHORT,15,Sponsor.FLY_EMIRATES,PosteJoueur.MILIEU);
         //ramos.celebrer();
         //ramos.defendre();
         //Gardien neuer=new Gardien("neuer","manuel","ifjiej", "18/07/1991","Bayern","bayern",88.5f,1.95f, Sexe.HOMME,Pied.GAUCHE,Tenue.SHORT,15,Sponsor.FLY_EMIRATES);
         //neuer.sortir();
         //Spectateur paul=new Spectateur("bollart",12,false,false);
         //Arbitre guillaume=new Arbitre("ovigneur","guillaume","guigou","12/07/1676","Lille", "France", 1.98f,1.67f,Sexe.HOMME,Pied.DROIT,Tenue.SHORT,48,Sponsor.MORELLE);
        Equipe marseille= new  Equipe (NomEquipe.OM);
        Equipe paris= new  Equipe (NomEquipe.PSG);
        Match match=new Match(TypeTerrain.GAZON,marseille,paris);
        match.simulerMatch();
        System.out.println(match.equipeGagnante);
        System.out.println(marseille.attaquants[2].getStatTir());
       
       
        
        
     


    /*Scanner sc = new Scanner(System.in);
    System.out.println("Voulez vous disputer un match ? Oui=1 ou NON=2 ");
    int i = sc.nextInt();
    System.out.println("Saisissez le numéro de l'equipe avec laquelle vous voulez Jouez "
            + "PSG :1"
            + "MARSEILLE:2 ");
    //On vide la ligne avant d'en lire une autre
    sc.nextLine();
    int equipe = sc.nextInt();      
    System.out.println("FIN ! ");
    
    switch(equipe) {
        case 1:
            Equipe paris= new  Equipe (NomEquipe.PSG);
            System.out.println(paris.stade);
            break;
        case 2 :
            Equipe marseille= new  Equipe (NomEquipe.OM);
            System.out.println(marseille.stade);
            
    }*/
  }
}
 


