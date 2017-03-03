/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compet;
import isen_projet_rigaut_ovigneur.*;
import java.util.ArrayList;


/**
 *
 * @author ISEN
 * This class allow us to instantiate a team only with his name.
 * Unfortunately and to make the process more faster, all the defenders will have the same characteristics.
 * The main advantage of this class is to create a Team only with his name
 */
public class Equipe {
    
    public  NomEquipe name;
    protected String stade;
    protected String surnom;
    protected Gardien gardien;
    protected Joueur[] joueurs = new Joueur[11];
    protected Defenseur[] defenseurs = new Defenseur[6];
      ArrayList defenseurs1 = new ArrayList();

     protected Milieu[] milieux = new Milieu[3];
     protected Attaquant[] attaquants= new Attaquant[3];
 
     
     /**The constructor allow us to create a team only with his name in parameters.
      * The others things(create goalkeeper,defenders,midfielders,strikers) will be create automatically
      *We will call the composant method to associate some chararacteristics like the stadium for example
      * @param name = will be the name of the team
      */
     
     
    public Equipe(NomEquipe name) {
        //String tab[] = typeEquipe(name);
        this.name = name;
        this.composant(name);
        //this.stade = tab[1];
        //this.victoiresCoupes = 0;
        this.gardien = new Gardien("Manuel","Neuer","Le robot","18/12/1990","test","Allemande", 90.0f,1.92f,Sexe.HOMME,Pied.AMBIDEXTRE,Tenue.GANTS_DE_GARDIEN,1,Sponsor.QATAR);
        for(int i = 0; i <4; i++) {
            this.defenseurs[i] = new Defenseur("Defenseur","Defend","Solide","12/07/1995","Monde","France",80.0f,1.89f ,Sexe.HOMME,Pied.DROIT,Tenue.SHORT,12,Sponsor.COQ_SPORTIF,PosteJoueur.DEFENSEUR);
            defenseurs1.add(defenseurs[i]);
        }
        for(int i = 0; i < 3; i++) {
            this.milieux[i] = new Milieu("POGBA","Paul","Pogboom","18/12/1990","Paris","France",88.0f,1.95f,Sexe.HOMME,Pied.GAUCHE,Tenue.SHORT,10,Sponsor.FLY_EMIRATES,PosteJoueur.MILIEU);
        }
        for(int i = 0; i < 3; i++) {
            this.attaquants[i] = new Attaquant("POGBA","Paul","Pogboom","18/12/1992","Paris","France",88.0f,1.95f,Sexe.HOMME,Pied.GAUCHE,Tenue.SHORT,10,Sponsor.FLY_EMIRATES,PosteJoueur.ATTAQUANT);
        }
    }
    
    /**The composant method make the link between the team name and the stadium and the nickname of this team.
     * 
     * @param name 
     */
    
    public void composant(NomEquipe name) {
        switch(name) {
            case PSG:
                this.surnom="Quatar Saint Germain";
                this.stade="Parc des princes";
                break;
             
            case MONACO:
                this.surnom="Monégasque";
                this.stade="Louis 2";
                break;
           case LYON:
                this.surnom="OL";
                this.stade="Parc Olympique";
                break;
               
            case OM:
                this.surnom="Meilleur club de France";
                this.stade="Velodrome";
                break;
            case SAINT_ETIENNE:
                this.surnom="Les verts";
                this.stade="Geoffroy Guichard";
                break;
            case NICE:
                this.surnom="Les aiglons";
                this.stade="Allianz Riviera";
                break;
            case CAEN:
                this.surnom="C'est un club de foot ca ?";
                this.stade="Michel d'Ornano";
                break;
            case NANTES:
                this.surnom="Les Canaris";
                this.stade="Stade de la Beaujoire";
                break;
            case BASTIA:
                this.surnom="On déconne pas avec les Corses";
                this.stade="Furiani";
                break;
             case GUINGAMP:
                this.surnom="L'en avant";
                this.stade="Stade Municipal de Roudourou";
                break;
             case LORIENT:
                this.surnom="Les Merlus";
                this.stade="Le moustoir";
                break;
                 
              case DIJON:
                this.surnom="La moutarde c'est de l'eau";
                this.stade="Gaston Gerard";
                break;
              case BORDEAUX:
                this.surnom="les Girondins";
                this.stade="Matmut Atlantique";
                break;
              case TOULOUSE:
                this.surnom="La ville rose";
                this.stade="Stadium";
                break;
              case RENNES:
                this.surnom="Les rouges et noirs";
                this.stade="ROAZHON PARK";
                break;
                  
              case METZ:
                this.surnom="Les grenats";
                this.stade="Saint-Symphorien";
                break;
              case ANGERS:
                this.surnom="Le SCO";
                this.stade="Jean BOUIN";
                break;
                  
             case MONTPELLIER:
                this.surnom="La Paillade";
                this.stade="Stade de la Mosson";
                break;
              case LILLE:
                this.surnom="Les dogues";
                this.stade="Pierre Mauroy";
                break;
                  
             default:
              this.surnom="KESTU FAIS";
              this.stade="INEXISTANT";
                        
        }
        
    }
    
    /**get the stade name
     * 
     * @return stade
     */
    
    public String getStade(){
        return this.stade;
    }
    /**get the nickname
     * 
     * @return nickname
     */
    
    public String getSurnom(){
        return this.surnom;
    }
    /**get the name of the team
     * 
     * @return name 
     */
    
    public NomEquipe getName(){
        return this.name;
    }
    
    /**
     * 
     * @param surnom 
     * change the nickname of the team
     */
    
  
    public void setSurnom(String surnom) {
        this.surnom=surnom;
    }

    @Override
    public String toString() {
        return ""+ name +"";
    }
    
    
    
        
    }
    

         
    
    
   
    