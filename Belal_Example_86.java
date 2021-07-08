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
public class Belal_Example_86 {
    public static void main(String[] args) {
    // class constructor with parameters
       M m1 = new M(5, 6, 7);
      
       M m2 = new M(9, 56, 90);
     
        
  }
}

class M {
    int a, b, c;
    
    // Default Constructor
    M() {
        
    }
    
    // Constructor with parameters
    M(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
}
