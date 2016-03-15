/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dxmlparser;

/**
 *
 * @author derwin
 */
public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private int salary;
    
    public Employee() {
    }
    
    public Employee(String first, String last, int age, int salary) {
        this.firstName = first;
        this.lastName = last;
        this.age = age;
        this.salary = salary;
    }
    
    public String getName() {
        return firstName + " " + lastName;
    }
    
    public void setFirstName(String fn){
        this.firstName=fn;
    }

    public void setLastName(String ln){
        this.lastName = ln;
    }

    public void setAge(int a){
        this.age = a;
    }

    public void setSalary(int s){
        this.salary = s;
    }

    public String toString() {
    String out = "Name: " + firstName + " " + lastName + 
            "\nAge: " + age +  
            "\nSalary:" + salary;
    return out;
    }
            
}
