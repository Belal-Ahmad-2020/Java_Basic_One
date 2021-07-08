/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

/**
 *
 * @author Full-Stack
 */
public class Belal_Example_81 {
    public static void main(String[] args) {
        
        G g1 = new G();
        System.out.println("Your name is " + g1.name);
        System.out.println("Last name is " + g1.lname);
        System.out.println(" Age " + g1.age);
    }
}

class G {
    
    String name = "Ajmal";
    String lname = "Mohammadi";
    int age = 25;
    
}
