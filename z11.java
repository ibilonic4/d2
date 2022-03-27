/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos;

import javax.swing.JOptionPane;

/**
 *
 * @author Ivor
 */
public class z11 {
    //12.	Za dani broj npr. 272723 provjerite da li je prosti (prim) broj
    public static void main(String[] args) {
        
        int i = Integer.parseInt(JOptionPane.showInputDialog("oinbafv"));
        boolean prim = false;
        for(int j = 2; j<i/2 ;j++){
        if(i%j == 0){System.out.println("NIJE PROSTI BROJ");prim = true; break;} 
        
        } if(prim==false){System.out.println("prosti broj");}
        
        
    }
}
