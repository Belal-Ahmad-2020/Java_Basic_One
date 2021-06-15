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
public class Belal_Sum_Two_Number {
    public static void main(String[] args) {
        
        int sum;
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Enter first number: ");
        int num1 = input.nextInt();
        
        System.out.println("Enter second number: ");
        int num2 = input.nextInt();
        
        sum = (int) (num1 + num2);
        
        System.out.println("The sum of "+ num1 + "+ " + num2 + " is " + sum);
        
    }
}
