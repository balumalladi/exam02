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
public class Person {
    public String name;
    public String address;
    public long phone_number;
    public String email;

    public Person(String name, String address, long phone_number, String email) {
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
        this.email = email;
    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }

    public long getPhone_number() {
        return phone_number;
    }
    public String getEmail() {
        return email;
    }
    @Override
    public String toString() {
        return "Person class " + name;
    }
    
}
