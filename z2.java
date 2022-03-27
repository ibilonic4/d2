/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos;

/**
 *
 * @author Ivor
 */
public class z2 {
    //3.	Ispisati sve parne brojeve od 3 do 99. Zbrojiti i ispisati zbroj svih neparnih brojeva
    
    public static void main(String[] args) {
        
        int zbroj =0;
        
        for(int i =3; i<=99; i++){
        if(i%2==0){System.out.println(i);}
        else {zbroj += i;}
            
        }
        System.out.println(zbroj);
        
    }
}
