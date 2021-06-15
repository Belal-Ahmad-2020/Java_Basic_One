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
public class Belal_Type_Casting {
    public static void main(String[] args) {
     /*
        Type casting: assigning a value of one primitive data type to another type.
        widening casting; to convert a smaller type to larger type.
        (byte -> short -> char -> int -> long -> float -> double)
        Narrowing Casting: to convert a larger type to smaller type.
        (double -> float -> long -> int -> char -> short -> byte)
     */
     
     // Widening Casting 
     int intNum = 43;
     double doubleNum = intNum;
            System.out.println(doubleNum);
            
     float floatNum = 4.5f;
     double doubleNumber = floatNum;
        System.out.println(doubleNumber);
     
     
        
     //Narrowing Casting 
     double num1 = 4.567d;
//     float num2 = num1;
     float num2 = (float) num1;
     
     
     
     double num3 = 432.444d;
//     int num4 = num3;
    int num4 = (int)num3;
             
    }
}
