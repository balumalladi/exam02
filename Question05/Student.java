/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question05;

/**
 *
 * @author Bala Shankar Malladi
 */
public class Student extends Person {
  public char grade;
  public final String classstatus= "Graduate";

    public Student(char grade, String name, String address, long phone_number, 
            String email) {
        super(name, address, phone_number, email);
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student class " + name;
    }
      
}
