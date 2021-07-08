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
public class Belal_Example_89 {
    public static void main(String[] args) {
        O o1 = new O("Ahmad", "Mohammdi", 23);

  }
}

class O {
    // public attributes
    public String name, email;
    public int age;
    
    
    O(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }
    
}