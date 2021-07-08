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
public class Belal_Example_87 {
    public static void main(String[] args ) {
        
        // Public modifier
        N n1 = new N();
        System.out.println(n1.num(5, 89, 50));
        
    }
}

 class N {
     public int a;
     public int b;
     public int c;
     
     public int num(int a, int b, int c) {
         return (a + b + c);
     }
}
