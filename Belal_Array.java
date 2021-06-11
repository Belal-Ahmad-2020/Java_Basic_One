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
public class Belal_Array {
    public static void main(String[] args) {
        // Array
        /*
            variable can store one value
            Array can store multiple values at a time 
        
        */
        
        
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        for(int num : numbers) {
            System.out.println(num);
        }
        
        // or we can use for loop instead of foreach 
        for (int a = 0; a <=  numbers.length; a++) {
            System.out.println(a);
        }
        
        
        
        
        String[] comScienceFields = {"IT", "SE", "IS"};
        comScienceFields[0] = "Information Technology";
        System.out.println(comScienceFields[0]);        
        
        
        for (String field : comScienceFields) {
            if(field == "IT") {
                continue;
            }
            System.out.println(field);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
