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
public class Belal_Example_77 {
    public static void main(String[] args) {
    
        // Accessing attriburtes of a class
       C c1 =  new C();
       
        System.out.println(c1.x);
        
        C c2 = new C();
        System.out.println(c2.y);
        
        
    }
}

class C {
    int x = 4;
    int y = 6;
}
