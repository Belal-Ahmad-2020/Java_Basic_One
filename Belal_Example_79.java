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
public class Belal_Example_79 {
    public static void main(String[] args) {
    
        // Accessing attriburtes of a class
       E e1 =  new E();
       
        System.out.println(e1.x);
        
        E e2 = new E();
        System.out.println(e2.y);
        
        
    }
}

class E {
    int x = 4;
    int y = 6;
}