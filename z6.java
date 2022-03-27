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
public class z6 {
    //7.	Za primljeni broj (npr 15) provjeriti da li je Parni ili Neparni. Ako je parni ispisati Osijek. Ako je neparni ispisati Osijek 10 puta pokraj drugog

    public static void main(String[] args) {
        int i = Integer.parseInt(JOptionPane.showInputDialog("broj"));

        if (i % 2 == 0) {
            System.out.println("Osijek");
        } else {
            for (int j = 0; j < 10; j++) {
                System.out.print("Osijek");
            }
        }

    }

}
