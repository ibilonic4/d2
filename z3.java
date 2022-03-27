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
public class z3 {
    //4.	Zbrojiti prvih 67 brojeva i ispisati zbroj
    
    public static void main(String[] args) {
        
        int zbroj= 0;
        int i = 1;
        
        while (i<= 67){
        zbroj += i;
        i++;
        }
        System.out.println(zbroj);
        
        
    }
}
