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
public class Belal_Assignment_Operator {
    public static void main(String[] args) {
        // Assignment Operators
        int x, y;
        x=3;
        y=5;
        
        y += x;
        y -=x;
        
        y *= x;
        y /= x;
        
        y %= x;
        
        System.out.println(y);  // x = 2 and y=3
        System.out.println(x);
        
        x &= 3;
        System.out.println(x); // x = 3
        
        x |= 3;
        System.out.println(x); // x = 3
        
        int a = 6;
        a ^= 3;
        System.out.println(a);  // a=5
        
        

    }
}
