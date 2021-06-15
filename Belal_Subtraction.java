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
public class Belal_Subtraction {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int subtraction;
        
        System.out.println("Enter fist number: ");
        int num1 = in.nextInt();
        
        System.out.println("ENter second number: ");
        int num2 = in.nextInt();
                
        if(num1 > num2) {
            subtraction = num1 - num2;
            System.out.println(subtraction);
        }
        else {
            System.out.println("Not valid operation. The first number should be greater than second number");
        }
    }
}


