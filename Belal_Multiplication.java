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
public class Belal_Multiplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int multiply;
        
        System.out.println("Enter first number: ");
        int num1 = in.nextInt();
        
        System.out.println("Enter second number: ");
        int num2 = in.nextInt();
        
        
        multiply = (num1 * num2);
        System.out.println(multiply);
        
    }
}
