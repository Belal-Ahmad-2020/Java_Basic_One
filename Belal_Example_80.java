/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

/**
 *
 * @author Full-Stack
 */
public class Belal_Example_80 {
    public static void main(String[] args) {
    
        // Overriding attriburtes of a class
       F f1 =  new F();
       f1.x = 10;
        System.out.println(f1.x);
        
        F f2 = new F();
        f2.y = 12;
        System.out.println(f2.y);
        
        
    }
}

class F {
    int x = 4;
    int y = 6;
}