/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isen_projet_rigaut_ovigneur;

/**
 *
 * @author ISEN
 * Allow you to create a spectator
 */
public class Spectateur extends Personne  implements AssisteMatch{
    private String tribune;
    private int place;
    private boolean chemise;
    private boolean lunettes;
    
    /**
     * Instantiates a new Spectator.
     *
     * @param tribune     =nom de tribune
     * @param place   = numero de place
     * @param lunettes   = porte des lunettes ou non
     * @param chemise = porte une chemise ou non
     */
    
    public Spectateur(String tribune,int place,boolean lunettes,boolean chemise) {
        this.tribune=tribune;
        this.place=place;
        try {
            this.chemise=chemise;
            this.lunettes=lunettes;
            verifieGenre (this.chemise,this.lunettes);
            
        }
        
        catch(VerifieGenreException e) {
            e.printStackTrace();
            
        }
        
    }
    
    /**This method allow us to set the sexe of the spectator in relation with his dress
     * 
     * @param chemise : wear a chemise or not
     * @param lunettes : wear glasses or not
     * @throws VerifieGenreException
     */
       public void verifieGenre (boolean chemise,boolean lunettes) throws VerifieGenreException {
        if (this.lunettes==true && this.chemise==true) {
            throw new VerifieGenreException();
            }
        else if (this.lunettes==true) {
            this.setSexe(Sexe.FEMME);
            }
        else if (this.chemise==true) {
            this.setSexe(Sexe.HOMME);
          
            }
        
        else {
            double loisProba=Math.random();
            if (loisProba<0.5) {
                this.setSexe(Sexe.HOMME);}
                else {
                        this.setSexe(Sexe.FEMME);
                        }
            
        }
       }
 /**
     * Gets tribune
     *
     * @return tribune
     */
    public String getTribune() {
        return tribune;
    }
    
     /**
     * Gets place
     *
     * @return place
     */

    public int getPlace() {
        return place;
    }
 /**
     * Gets chemise
    
     * @return chemise
     */
    public boolean isChemise() {
        return chemise;
    }
 /**
     * Gets lunettes
     *
     * @return lunettes
     */
    public boolean isLunettes() {
        return lunettes;
    }
     /**
     *   overriding of the crier method for a spectator
     */   
 @Override
    public void crier(){
    System.out.print("Que c'est bon de supporter son équipe pendant son temps libre");

}
    
    /**
     *   overriding of the encourager methode for a spectator
     */
    
    @Override
    public void encourager() {
        System.out.println("ON Y CROIT");
    }
    /**
     *   overriding of the pleurer fonction for a spectator
     */
    @Override
    public void pleurer() {
        System.out.println("SNIF SNIF SNIF SNIF");
    }
    /**
     *   overriding of the dormir fonction for a spectator
     */
    
    @Override
    public void dormir() {
        System.out.println("ZZZZZZZZZZ");
    }


}
   
     
 
        
    

