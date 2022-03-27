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
public class z1 {
    // 2.	Ispisati Hello world 100 puta odvojeno s zarezom u istom retku
    
    public static void main(String[] args) {
        
        for(int i = 0; i < 100; i++){
            if(i==99){System.out.println("Hello world");
            break;}
            System.out.print("Hello world, ");
        }
        
        
    }
}
