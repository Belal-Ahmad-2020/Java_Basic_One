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
public class Belal_Logical_Operator {
    public static void main(String[] args) {
        // Comparison Operator 
        int x, y;
        
        x = 5; 
        y = 9;
        
        if(x>=4 && y <= 4) {
            System.out.println("And");
        }
        else if(x>4 || y<10) {
            System.out.println("OR");
        }
        else if(!(x>4)) {
            System.out.println("Not");
        }
        else {
            System.out.println("Logical Operator");
        }
    }
}
