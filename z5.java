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
public class z5 {
    //6.	Za tri primljena broja (npr. 3,7,4) ispisati najveći
    
    public static void main(String[] args) {
        
        int i = Integer.parseInt(JOptionPane.showInputDialog("broj 1"));
        int j = Integer.parseInt(JOptionPane.showInputDialog("broj 2"));
        int k = Integer.parseInt(JOptionPane.showInputDialog("broj 3"));
        
        if(i>j && i>k){System.out.println(i);}
        if(j>i && j>k){System.out.println(j);}
        if(k>i && k>j){System.out.println(k);}
        
        
    }
}
