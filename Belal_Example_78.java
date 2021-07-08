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
public class Belal_Example_78 {
    public static void main(String[] args) {
    
        // Modify attriburtes of a class
       D d1 =  new D();
       d1.x = 5;
        System.out.println(d1.x);
        
        D d2 = new D();
        d2.y = 7;
        System.out.println(d2.y);
        
        
    } 
}

class D {
    int x = 4;
    int y = 6;
}