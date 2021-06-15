/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3schools;

/**
 *
 * @author Full-Stack
 */
public class Belal_While_Loop {
   public static void main(String[] args) {
       // while loop
       // is used to run specific many times until condition is true
       int x;
       
       x=0;
 
       while(x < 5) {
           System.out.println(x);
           x++;
       }
       
       
       // print numbers (1-10)
       x = 0;
       
       while(x <= 10) {
           System.out.println(x);
           x++;
       }
       
       
       // Print Even numbers
       
       x = 0;
       
       while( x <= 100 ) {
           System.out.print(x);
           x += 2;
       }
       
       
       
       // Print odd Numbers
       
       x = 1;
       
       while( x <=100 ) {
           System.out.print(x);
           x += 2;
       }
       
       
       
       
   }
}
