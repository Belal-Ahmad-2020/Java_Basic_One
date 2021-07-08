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
public class Belal_Example_92 {
    public static void main(String[] args) {
     S s1 = new S();
     s1.age = 24;
     s1.email = "samir@gmail.com";
     s1.name = "Abdul Samir";
     
    }
}


class R {
    // Protected attributes
    protected String name, email;    
    protected int age;    
    
    R() {
        
    }        
}


class S extends R {
    
}