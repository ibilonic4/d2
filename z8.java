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
public class z8 {
    //9.	Sve dok korisnik ne unese broj 5 ispisuje Đakovo. Kada unese broj 5 izađi iz programa
    
    public static void main(String[] args) {
        
        while(true){
        int i = Integer.parseInt(JOptionPane.showInputDialog("broj"));
        if(i==5){break;}
        else{System.out.println("Džakovo");} 
        }
        
        
    }
}
