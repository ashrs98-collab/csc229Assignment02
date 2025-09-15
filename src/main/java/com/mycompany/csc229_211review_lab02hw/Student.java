package com.mycompany.csc229_211review_lab02hw;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Person {
    private String address; // to extend parent class method
    private int gpa;  // to set new child class attribute

    Student(int gpa, String address, String name, short age){
        super(name,age);
        this.gpa = gpa;
        this.address = address;
    } // Student class with all fields from parent and student

    public void setGpa(int gpa){
        this.gpa = gpa;
    }
    public int getGpa(){
        return this.gpa;
    }

    public String toString(){
        return "name: " + getName() + "Gpa: " + gpa + "address: "+ address + "Age "+ getAge();

    }


    @Override
    public void setAddress(String address) {
        this.address = address;
    }                                                  // Override methods from parent class
    @Override
    public String getAddress(){
        return this.address;
    }


}
