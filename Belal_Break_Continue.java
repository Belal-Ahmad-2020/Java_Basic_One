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
public class Belal_Break_Continue {
    public static void main(String[] args) {
         // Break 
         // jump over 
         
         int x;
         
         for(x = 0; x <= 10; x++) {
             if(x == 6) {
                 break;
             }
             System.out.println(x);
         }
         
         
         
         
         // Continue
         // only escape current state
         
         for (x = 0; x <= 10; x++) {
             if(x == 6) {
                 continue;
             }
             System.out.println(x);
         }
         
         
         
         
         
    }
}
