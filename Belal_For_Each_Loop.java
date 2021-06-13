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
public class Belal_For_Each_Loop {
    public static void main(String[] args) {
        // For Each Loop 
        // when you want to print vlaues from an array you can use for each loop 
        
        String[] names = {"Ahmad", "Mohammad", "Ali"};
        for (String name : names) {
            System.out.println(name);
        }
        
        
        
        
        String[] colors = {"Green", "Red", "Balck"}; 
        for(String x : colors) {
            System.out.println(x);
        }
        
        
        
        
        String[] development = {"Web", "App", "Software", "Database"};
        for(String a : development) {
            System.out.println(a);
        }
        
    }
}
