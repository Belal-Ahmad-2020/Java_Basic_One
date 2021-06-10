/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3schools;
import java.util.Scanner;
/**
 *
 * @author Full-Stack
 */
public class Belal_Division {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float divOperation = 0;
        
        System.out.println("Enter first number: ");
        float num1 = in.nextFloat();
        
        System.out.println("Enter second number: ");
        float num2 = in.nextFloat();
        
        if(num2 == 0 ) {
            System.out.println("Invalid Operation.");            
        }
        else {
            divOperation = (float)(num1 / num2);   
             System.out.println(divOperation);
        }
        
    
        
        
        
        
    }
}
