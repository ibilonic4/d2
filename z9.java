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
public class z9 {
    
    //Isto kao 8. ali nakon sto upise 5 jos jednom se pojavi izbornik i sta god da unese break
       public static void main(String[] args) {
        
        while(true){
        int i = Integer.parseInt(JOptionPane.showInputDialog("broj"));
        if(i==5){
            int j = Integer.parseInt(JOptionPane.showInputDialog("broj"));
            break;}
        else{System.out.println("Džakovo");} 
        }
        
        
    }
}
