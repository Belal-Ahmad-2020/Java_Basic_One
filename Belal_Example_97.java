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
public class Belal_Example_97 {
    public static void main(String[] args) {
        // Encapsulation
        V v1 = new V();
        v1.setName("Ahmad");
        v1.setLastName("Ahmadi");
        v1.setAge(23);
        
        System.out.println("Name: " + v1.getName());
        System.out.println("Last Name: " + v1.getLastName());
        System.out.println("Age: " + v1.getAge());
        
    }
}

class V {
    private String name;
    private String lname;
    private int age;
    
    
    // Setter and Getter method for name
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    // Setter and Getter method for last name
    public String getLastName() {
        return lname;
    }
    
    public void setLastName(String lname) {
        this.lname = lname;
    }
    
    // Setter and Getter method for age
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    
    
    
}
