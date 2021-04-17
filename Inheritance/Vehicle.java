/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author Bala Shankar Malladi
 */
public class Vehicle {
    String type;

    public Vehicle(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Vehicle" + "type=" + type + '}';
    }
}
