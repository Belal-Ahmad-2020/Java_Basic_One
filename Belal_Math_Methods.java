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
public class Belal_Math_Methods {
    public static void main(String[] args) {
        // find the square root of a number 
        int x, y;
        
        x = 36;
        System.out.println(Math.sqrt(x));
        
        y = 49;
        System.out.println(Math.sqrt(y));
        
        
        // FInd the positive number
        x = -43;
        System.out.println(Math.abs(x));
        
        
        // Genrate random number between 0 and 1 (0 is inclusive and 1 is exclusive)
        System.out.println(Math.random());        
        System.out.println(Math.random()+10);
        System.out.println(Math.random()*10);
        
        
        
    }
}
