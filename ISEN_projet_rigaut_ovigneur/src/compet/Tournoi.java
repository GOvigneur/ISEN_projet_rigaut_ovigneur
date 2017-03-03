/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */






package compet;
import java.util.Collections;
import java.util.ArrayList;


/**
 *
 * @author ISEN
 */
public class Tournoi {
    public ArrayList<Equipe> equipeEnLis=new ArrayList<Equipe>();
    public ArrayList<Equipe> equipeQualifie=new ArrayList<Equipe>();
    private  ArrayList<Equipe> equipeGagnanteHuit=new ArrayList<Equipe>();
    private ArrayList<Equipe> equipePerdanteHuit=new ArrayList<Equipe>();  
    private ArrayList<Equipe> equipeGagnanteQuarts=new ArrayList<Equipe>();
    private ArrayList<Equipe> equipePerdanteQuarts=new ArrayList<Equipe>();
    private ArrayList<Equipe> equipeGagnanteDemi=new ArrayList<Equipe>();
    private ArrayList<Equipe> equipePerdanteDemi=new ArrayList<Equipe>();
    private ArrayList<Equipe> equipeFinale=new ArrayList<Equipe>();

    
    
    public   static String nom="Coupe de France";
    
    
    

public Tournoi() {
Equipe Marseille=new Equipe(NomEquipe.OM);
equipeEnLis.add(Marseille);
 Equipe Paris=new Equipe(NomEquipe.PSG);
equipeEnLis.add(Paris);
Equipe Lyon=new Equipe(NomEquipe.LYON);
equipeEnLis.add(Lyon);
Equipe Monaco=new Equipe(NomEquipe.MONACO);
equipeEnLis.add(Monaco);
Equipe Nice=new Equipe(NomEquipe.NICE);
equipeEnLis.add(Nice);
Equipe Bastia=new Equipe(NomEquipe.BASTIA);
equipeEnLis.add(Bastia);
Equipe Saint_Etienne=new Equipe(NomEquipe.SAINT_ETIENNE);
equipeEnLis.add(Saint_Etienne);
Equipe Nantes=new Equipe(NomEquipe.NANTES);
equipeEnLis.add(Nantes);
Equipe Caen=new Equipe(NomEquipe.CAEN);
equipeEnLis.add(Caen);
Equipe Lorient=new Equipe(NomEquipe.LORIENT);
equipeEnLis.add(Lorient);
Equipe Guingamp=new Equipe(NomEquipe.GUINGAMP);
equipeEnLis.add(Guingamp);
Equipe Bordeaux=new Equipe(NomEquipe.BORDEAUX);
equipeEnLis.add(Bordeaux);
Equipe Metz=new Equipe(NomEquipe.METZ);
equipeEnLis.add(Metz);
Equipe Dijon=new Equipe(NomEquipe.DIJON);
equipeEnLis.add(Dijon);
Equipe Toulouse=new Equipe(NomEquipe.TOULOUSE);
equipeEnLis.add(Toulouse);
Equipe Angers=new Equipe(NomEquipe.ANGERS);
equipeEnLis.add(Angers);
Equipe Lille=new Equipe(NomEquipe.LILLE);
equipeEnLis.add(Lille);
Equipe Montpellier=new Equipe(NomEquipe.MONTPELLIER);
equipeEnLis.add(Montpellier);
Equipe Rennes=new Equipe(NomEquipe.RENNES);
equipeEnLis.add(Rennes);
Equipe Nancy=new Equipe(NomEquipe.NANCY);
equipeEnLis.add(Nancy);
 Collections.shuffle(equipeEnLis);   // melange de l'ArrayList des 20 equipes
      
}

/**
 * 
 * passe des 20 equipes aux 16 equippes qualifiees
     * @return 
 */
public ArrayList qualificaionsTournoi() {
    
    for (int i=0;i<=15;i++)  {
       this. equipeQualifie.add(i,equipeEnLis.get(i));
    }
    return equipeQualifie;   
    }

public ArrayList huitiemes () {
    Collections.shuffle(equipeQualifie);
    for (int i=0;i<=15;i=i+2) {
        Match huitieme= new Match(TypeTerrain.GAZON,equipeEnLis.get(i),equipeEnLis.get(i+1));
        huitieme.simulerMatch();              
    
    //return huitieme.equipeGagnante;
        if (huitieme.equipeGagnante==1) {
            equipeGagnanteHuit.add(equipeQualifie.get(i));
            equipePerdanteHuit.add(equipeQualifie.get(i+1));
             }
        if (huitieme.equipeGagnante==2) {
            equipeGagnanteHuit.add(equipeQualifie.get(i+1));
            equipePerdanteHuit.add(equipeQualifie.get(i));
        }
    }
    System.out.println(equipeGagnanteHuit);
    return equipeGagnanteHuit;    
}

public ArrayList quarts (){
    Collections.shuffle(equipeGagnanteHuit);
    
    for (int i =0 ; i<=7 ; i=i+2){
        Match quarts = new Match(TypeTerrain.GAZON, equipeGagnanteHuit.get(i), equipeGagnanteHuit.get(i+1));
        quarts.simulerMatch();
        
        //return équipes gagnante en quarts
        if (quarts.equipeGagnante==1) {
            equipeGagnanteQuarts.add(equipeGagnanteHuit.get(i));
            equipePerdanteQuarts.add(equipeGagnanteHuit.get(i+1));
        }
            
        if (quarts.equipeGagnante==2) {
            equipeGagnanteQuarts.add(equipeGagnanteHuit.get(i+1));
            equipePerdanteQuarts.add(equipeGagnanteHuit.get(i));
        }  
    }
    System.out.println(equipeGagnanteQuarts);
    return equipeGagnanteQuarts;
}

public ArrayList demi (){
    Collections.shuffle(equipeGagnanteQuarts);
    
    for (int i =0 ; i<=3 ; i=i+2){
        Match demi = new Match(TypeTerrain.GAZON, equipeGagnanteQuarts.get(i), equipeGagnanteQuarts.get(i+1));
        demi.simulerMatch();
        
        //return équipes gagnante en quarts
        if (demi.equipeGagnante==1) {
            equipeGagnanteDemi.add(equipeGagnanteQuarts.get(i));
            equipePerdanteDemi.add(equipeGagnanteQuarts.get(i+1));
        }
            
        if (demi.equipeGagnante==2) {
            equipeGagnanteDemi.add(equipeGagnanteQuarts.get(i+1));
            equipePerdanteDemi.add(equipeGagnanteQuarts.get(i));
        }  
    }
    System.out.println(equipeGagnanteDemi);
    return equipeGagnanteDemi;
}

public ArrayList finale (){
    
        Match finale = new Match(TypeTerrain.GAZON, equipeGagnanteHuit.get(0), equipeGagnanteHuit.get(1));
        finale.simulerMatch();
        
        //return équipes gagnante en quarts
        if (finale.equipeGagnante==1) {
            equipeFinale.add(equipeGagnanteDemi.get(0));
        }
            
        if (finale.equipeGagnante==2) {
            equipeFinale.add(equipeGagnanteDemi.get(1));
        }  
    System.out.println(equipeFinale);
    return equipeFinale;
}

    public ArrayList<Equipe> getEquipeEnLis() {
        return equipeEnLis;
    }

    public ArrayList<Equipe> getEquipeQualifie() {
        return equipeQualifie;
    }

    public ArrayList<Equipe> getEquipeGagnanteHuit() {
        return equipeGagnanteHuit;
    }

    public ArrayList<Equipe> getEquipePerdanteHuit() {
        return equipePerdanteHuit;
    }

    public ArrayList<Equipe> getEquipeGagnanteQuarts() {
        return equipeGagnanteQuarts;
    }

    public ArrayList<Equipe> getEquipePerdanteQuarts() {
        return equipePerdanteQuarts;
    }

    public ArrayList<Equipe> getEquipeGagnanteDemi() {
        return equipeGagnanteDemi;
    }

    public ArrayList<Equipe> getEquipePerdanteDemi() {
        return equipePerdanteDemi;
    }

    public ArrayList<Equipe> getEquipeFinale() {
        return equipeFinale;
    }


}