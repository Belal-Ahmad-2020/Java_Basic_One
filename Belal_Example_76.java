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
public class Belal_Example_76 {
    public static void main(String[] args) {
    
        // create multiple object
       B b1 =  new B();
       
        System.out.println(b1.x);
        
        B b2 = new B();
        System.out.println(b2.y);
        
        
    }
}

class B {
    int x = 4;
    int y = 6;
}