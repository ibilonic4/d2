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
public class z7 {
    //8.	Za uneseni tekst ocjene ispišite njezin ekvivalent u broju
    public static void main(String[] args) {
        
        String ocijena = JOptionPane.showInputDialog("fsjafipovashnfvpi");
        
        switch(ocijena.toLowerCase().trim()){
            case "jedan": System.out.println("1"); break;
            case "dovoljan": System.out.println("2"); break;
            case "tri": System.out.println("3"); break;
            case "cetiri" : System.out.println("4"); break;
            case "pet": System.out.println("5"); break;
            default: System.out.println("to nije broj!");
        
        }
        
        
        
    }
}
