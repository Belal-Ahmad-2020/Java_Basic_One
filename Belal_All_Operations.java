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
public class Belal_All_Operations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float num1;
        float num2;
        float result;
        float add, sub, mul, dev;
    
 
        
        System.out.println("Enter the first number");
        num1 = in.nextFloat();
        
        System.out.println("Enter the second number");
        num2 = in.nextFloat();
        
               
        System.out.println("Enter the operation: (+, -, *, /)");         

 
        if(in.next().charAt(0) == '+') {
             add = num1 + num2;
              System.out.println("The addtion of "+num1+" + "+num2+" = " + add);
        }
        else if(in.next().charAt(0) == '-') {
            sub = num1 - num2;
              System.out.println("The subtraction of "+num1+" - "+num2+" = " + sub);
        }
        else if(in.next().charAt(0) == '*') {
            mul = (num1 * num2);
              System.out.println("The multiplication of "+num1+" * "+num2+" = " + mul);
        }
        else if(in.next().charAt(0) == '/') {
            dev = (float)(num1 / num2);
              System.out.println("The devision of "+num1+" / "+num2+" = " + dev);
        }
        else {
            System.out.println("Invalid Operation");
        }
        
        
       
     
        
        
        
    }
}
