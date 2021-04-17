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
public class Staff extends Employee{
   public String title;

    public Staff(String title, String office, int salary, Date dateHired, 
            String name, String address, long phone_number, String email) {
        super(office, salary, dateHired, name, address, phone_number, email);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff class "+ name;
    }
   
}
