/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;
import java.util.Scanner;
/**
 *
 * @author Full-Stack
 */
public class Belal_Example_100 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a String ");
        String txt = in.nextLine();
        
        System.out.println("Enter a Byte ");
        Byte b = in.nextByte();
        
        System.out.println("Enter a short ");
        short s = in.nextShort();
        
        System.out.println("Enter a int ");
        int i = in.nextInt();
        
        System.out.println("Enter a long ");
        long l = in.nextLong();
        
        System.out.println("Enter a  charachter ");
        char c = in.next().charAt(0);
        
        System.out.println("Enter a  float ");
        float f = in.nextFloat();
        
        System.out.println("Enter a double ");
        double d = in.nextDouble();
        
        
    }
}
