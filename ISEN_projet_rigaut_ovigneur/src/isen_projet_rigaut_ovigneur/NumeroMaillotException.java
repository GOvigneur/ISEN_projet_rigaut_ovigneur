/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isen_projet_rigaut_ovigneur;

/** NumeroMaillotException:This is an personnalised exception who allow only few number on the jersey
 *
 * @author ISEN
 */
public class NumeroMaillotException extends Exception{
    public NumeroMaillotException() {
    System.out.println("Le numéro de maillot doit être contenu entre 1 et 99");
    
}
}

