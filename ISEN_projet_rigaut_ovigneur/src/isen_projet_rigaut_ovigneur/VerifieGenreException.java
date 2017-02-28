/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isen_projet_rigaut_ovigneur;

/**
 *
 * @author ISEN
 */
public class VerifieGenreException extends Exception {
    public  VerifieGenreException() {
        System.out.println("Une femme ne peut porter de chemise ou un homme ne peut porter de lunettes");
    }
    
}
