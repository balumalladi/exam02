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
public class Faculty extends Employee{
    public int officeHours;
    public int numofteachingsubjects;

    public Faculty(int officeHours, int numofteachingsubjects, String office, 
            int salary, Date dateHired, String name, String address, 
            long phone_number, String email) {
        super(office, salary, dateHired, name, address, phone_number, email);
        this.officeHours = officeHours;
        this.numofteachingsubjects = numofteachingsubjects;
    }

    @Override
    public String toString() {
        return "Faculty class " + name;
    }
    
}
