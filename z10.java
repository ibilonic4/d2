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
public class z10 {
    //10.	Korisnik unosi cijele brojeve sve dok se ne unese broj -1. Program ispisuje sumu svih neparnih unesenih brojeva
    
    public static void main(String[] args) {
        
        
        int zbroj = 0;
        
        while(true){
        int i = Integer.parseInt(JOptionPane.showInputDialog("broj"));
        if(i == -1){System.out.println(zbroj);break;}
        
        if(i%2 != 0){
        zbroj += i;}
        
        }
        
    }
}
