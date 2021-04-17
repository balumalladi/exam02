/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question05;

import java.util.Date;

/**
 *
 * @author Bala Shankar Malladi
 */
public class Employee extends Person{
    public String office;
    public int salary;
    public Date dateHired;

    public Employee(String office, int salary, Date dateHired, String name, 
            String address, long phone_number, String email) {
        super(name, address, phone_number, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Employee class " +name;
    }
    
}
