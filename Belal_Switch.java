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
public class Belal_Switch {
    public static void main(String[] args) {
        // switch use diffirent cases 
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        
        switch(num) {
            case 1:
                System.out.println("Your number is \'1\'");
                break;
            case 2:
                System.out.println("Your number is \'2\'");
                break;
            case 3:
                System.out.println("Your number is \'3\'");
                break;
            case 4:
                System.out.println("Your number is \'4\'");
                break;
            case 5:
                System.out.println("Your number is \'5\'");
                break;
            case 6:
                System.out.println("Your number is \'6\'");
                break;
            case 7:
                System.out.println("Your number is \'7\'");
                break;
            case 8:
                System.out.println("Your number is \'8\'");
                break;
            case 9:
                System.out.println("Your number is \'9\'");
                break;
            default:
                System.out.println("Your number is greater than 9");
        }
        
    }
}
