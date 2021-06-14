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
public class Belal_For_Loop {
    public static void main(String[] args) {
        // For Loop 
        // when we want to run specific part of code for specific times 
        
        // print numbers between (1-10)
        for(int a = 0; a <= 10; a++) {
            System.out.println(a);
        }
        
        // print even numbers
        for(int a = 2; a % 2 == 0; a += 2) {
            if(a >= 100) {
                break;
            }
            System.out.println(a);
        }
        
        // print odd numbers
        for(int a = 1; a % 2 != 0; a += 2) {
            if(a >= 100) {
                break;
            }
            System.out.println(a);
        }        
        
        
    }
}
