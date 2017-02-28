/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compet;
import isen_projet_rigaut_ovigneur.*;
import java.util.Random;

/**
 *
 * @author ISEN
 * This class allow us to instantiate a Match.A Match has several thigs:
 * A Arbitre, a TypeTerrain,some spectators and 2 teams. We will create some methods in this class to simulate a game.
 */
public class Match {
    private Arbitre arbitre;
    private TypeTerrain typeTerrain;
    private Equipe equipe1;
    private Equipe equipe2;
    protected Spectateur[] spectateurs = new Spectateur[50];
    protected int equipeGagnante=0;
    private int minutes =0;
    private int nombreDeButsEquipe1=0;
    private int nombreDeButsEquipe2=0;
    
    /**
     * The constructor of the Match.
     * We want to have some Spectateurs in a different places in the stadium,in a different name and with a different sexe.
     * Also we have a referre on the pitch
     * @param typeTerrain : the type of Terrain we want= GAZON or SYNTHETIQUE
     * @param equipe1: the first team of the game
     * @param equipe2 : the second team of the team
     */
    
    public Match (TypeTerrain typeTerrain,Equipe equipe1,Equipe equipe2) {
        this.typeTerrain=typeTerrain;
        this.equipe1=equipe1;
        this.equipe2=equipe2;
        this.arbitre=new Arbitre("Turpin","Clement","Arbitre","16/05/1982","Oulins","Fraçaise", 80f, 1.90f,Sexe.HOMME);
        
        for(int i=0;i < 25 ;i++) {
            this.spectateurs[i]=new Spectateur("Virage droit",i,true,false);
            }
        for (int i =25;i<49;i++) {
            this.spectateurs[i]=new Spectateur("Virage gauche",i,false,true);
           }
    }
    
    /**
     * Function that permits to simulate a match with different steps.
     * - Tir des attaquants des deux équipes avec possibilité de blessure
     * - Possibilite de fautes / carton jaune / carton rouge
     * - Tir des milieux des deux equipes
     * - Sinon pas de but
     * - On comptabilise le nombre de but
     *      => Si egalite : 
     * - Prolongations
     *      => Si egalite :
     * - Penaltys
     * @return equipeGagnante
     */
    public int  simulerMatch() {
        
        
        while (minutes<10) {
            for(int i =0;i<=2;i++) {
                
                // tir d'un attaquant de l'equipe 1
                if (equipe1.attaquants[i].tirer()>equipe2.defenseurs[i].defendre() && equipe1.attaquants[i].tirer()>equipe2.gardien.parade() && arbitre.siffleFaute()==false) {
                    
                    if (Match.blessure()!=true) {
                        //But pour l'équipe 1
                        nombreDeButsEquipe1++;                   
                        spectateurs[5].crier();
                        spectateurs[30].encourager();
                        arbitre.exprimer("But pour l'equipe 1");
                     
                    
                    }
                    else {
                        //Blessure du joueur de l'équipe 1
                        spectateurs[10].pleurer();
                        arbitre.exprimer("Blessure d'un joueur à la minute "+ "   "+ minutes);
                        equipe1.attaquants[2].seBlesser();
                        equipe1.attaquants[2].remiseZero();                      
                    }
                }
                                     
                    // tir d'un attaquant de l'equipe 2                
                else if (equipe2.attaquants[i].tirer()>equipe1.defenseurs[i].defendre() && equipe2.attaquants[i].tirer()>equipe1.gardien.parade() && arbitre.siffleFaute()==false) {
                    //But pour l'équipe 2
                    if (Match.blessure()!=true) {
                    nombreDeButsEquipe2++;
                    spectateurs[5].crier();
                    spectateurs[30].encourager();
                    arbitre.exprimer("But pour l'equipe 2");
                 
                    }
                    // Blessure du joueur de l'équipe 2
                     else {
                        spectateurs[10].pleurer();
                        arbitre.exprimer("Blessure d'un joueur à la minute "+ "   "+ minutes);
                        equipe2.attaquants[2].seBlesser();
                        equipe2.attaquants[2].remiseZero();
                     }
                     
                }
                
                // si faute, possibilité de mettre un carton jaune. Si 2 cartons jaune, le joueur sort du terrain
                else if (arbitre.siffleFaute()==true) { 
                    arbitre.exprimer("FAUTTTTEEE");
                    
                    //Test faute pour l'équipe 1
                    if (equipe1.defenseurs[i].agression()>equipe2.defenseurs[i].agression()) {
                        equipe1.defenseurs[i].incrementCartonJaune();
                        arbitre.exprimer("Carton Jaune pour l'équipe 1");                                           
                        
                        //Test carton rouge équipe 1
                        if (equipe1.defenseurs[i].getCartonJaune()==2) {
                            arbitre.exprimer("Exclusion du joueur numero "+ "   "+" "+equipe1.defenseurs[1].getNumeroMaillot() + " a la minute "+minutes);
                            equipe1.defenseurs[1].remiseZero();
                            arbitre.exprimer("Carton Rouge ! SORTEZ !!");
                            }
                    }
                    //Test faute pour l'équipe 2
                    else if (equipe2.defenseurs[i].agression()>equipe1.defenseurs[i].agression()) {
                        equipe2.defenseurs[i].incrementCartonJaune();
                        arbitre.exprimer("Carton Jaune pour l'équipe 2");  
                        
                        // Test carton rouge équipe 2
                        if (equipe2.defenseurs[i].getCartonJaune()==2) {
                            arbitre.exprimer("Exclusion du joueur numero "+ "   "+" "+equipe2.defenseurs[1].getNumeroMaillot() + " a la minute "+minutes);
                            equipe2.defenseurs[1].remiseZero();
                            arbitre.exprimer("Carton Rouge ! SORTEZ !!");
                        }
                    }
                    
                    // Pas de faute   
                    else {
                        arbitre.exprimer("Attention à la prochaine fois");
                    }                 
                }
                    
                
                // tir d'un milieu de l'equipe 1
                else if (equipe1.milieux[i].tirer()>equipe2.defenseurs[i].defendre() && equipe1.milieux[i].tirer()>equipe2.gardien.parade() && arbitre.siffleFaute()==false) {
                    nombreDeButsEquipe1++;
                    spectateurs[5].crier();
                    spectateurs[30].encourager();
                    arbitre.exprimer("But pour l'equipe 1");
                 }
                // tir d'un milieu de l'equipe2
                else if (equipe2.milieux[i].tirer()>equipe1.defenseurs[i].defendre() && equipe2.milieux[i].tirer()>equipe1.gardien.parade() && arbitre.siffleFaute()==false) {
                    nombreDeButsEquipe2++;
                    spectateurs[5].crier();
                    spectateurs[30].encourager();
                    arbitre.exprimer("But pour l'equipe 2");
                 }
                
                else {  // pas de but, les spectateurs s'endorment.
                    spectateurs[3].dormir();
                    arbitre.exprimer("Le jeu continue");
                }
            }
            minutes++;
        }
        
        // On comptabilise le nombre de buts dans chaque equipe
        if (nombreDeButsEquipe1>nombreDeButsEquipe2)  {
            equipeGagnante=1;                           //Equipe 1 gagnante 
            }
        else if (nombreDeButsEquipe2>nombreDeButsEquipe1) {
            equipeGagnante=2;                           //Equipe 2 gagnante
        }       
        else {
            equipeGagnante=0;                           //Egalite : prolongations - penaltys

            int minutesProlongation = 0;
            int compteur1=0;
            int compteur2=0;
            arbitre.exprimer("Prolongations");
            spectateurs[10].encourager();

            //Prolongations en fonction de la fatigue de 3 joueurs pendant 4 tours
            while (minutesProlongation !=3){
                for (int j =0 ; j<=2 ; j++){

                    if (equipe1.attaquants[j].fatigue() > equipe2.attaquants[j].fatigue()){
                        compteur1++;
                    }
                    else{
                        compteur2++;
                    }

                    if (equipe1.defenseurs[j].fatigue() > equipe2.defenseurs[j].fatigue()){
                        compteur1++;
                    }
                    else {
                        compteur2++;
                    }
                    if (equipe1.milieux[j].fatigue() > equipe2.milieux[j].fatigue()){
                        compteur1++;
                    }
                    else {
                        compteur2++;
                    }
                }
                minutesProlongation++;
            }

            // On compte le nombre de "points de fatigue"

            //Equipe 2 gagne
            if (compteur1 > compteur2){
                equipeGagnante=2;       
            }

            //Equipe 1 gagne
            else if (compteur2 > compteur1){
              equipeGagnante=1;         
            }

            // Egalite on passe aux penaltys = victoire au hasard
            else {
                equipeGagnante=0;
                equipeGagnante = Match.penalty();
            } 
    }     
    return equipeGagnante;
    }
        
    
    /**
     * Methode simulant la blessure.
     * Utilisation d'un random de 0 à 10
     * @return blessure
     */
    public static  boolean blessure() {
         boolean blessure=false;
        Random rand = new Random();
        int nombreAleatoire = rand.nextInt(10);
       
             if (nombreAleatoire  <3)
                {
                   blessure=true;
                   }
             return blessure;
                    
                }
            
    /**
     * Simulation des penaltys.
     * Random entre les deux équipes
     * @return resultat
     */  
    public static int penalty(){
        int resultat=0;
        double penalty1 = Math.random();
        double penalty2 = Math.random();
        if (penalty1 > penalty2){
            resultat = 1;
        }
        else {
            resultat =2;
        }
        return resultat;
    }
 
}


   


