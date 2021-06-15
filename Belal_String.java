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
public class Belal_String {
      public static void main(String[] args) {
          // String in java is actullay an object
          String msg = "Hello Java";
          System.out.println(msg);
          
          // String Methods
          // toUpperCase()
          String newMsg = msg.toUpperCase();
          
          //toLowerCase()
          String lower = msg.toLowerCase();
          
          
          // Concatenation 
          String fname = "Ahmad";
          String lname = "Ahmadi";
          String fullName = fname + lname;
          System.out.println(fullName);
          System.out.println(fname.concat(lname));
          
      }
}
