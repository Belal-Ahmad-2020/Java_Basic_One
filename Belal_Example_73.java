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
public class Belal_Example_73 {
        public static void main(String[] args) {
        age(15);
        age(25);
    }
     
    public static void age(int age) {
     // print "access denied"
    if (age < 18) {
      System.out.println("Access denied - You are not old enough!"); 
      
    // If age is greater than 18, print "access granted"
    } else {
      System.out.println("Access granted - You are old enough!"); 
    }
    
  } 
}
