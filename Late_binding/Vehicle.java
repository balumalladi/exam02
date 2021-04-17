/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Late_binding;

/**
 *
 * @author Bala Shankar Malladi
 */
public class Vehicle {
   public void print() {
        System.out.println("This is Vehicle class");
    }
   public class Car extends Vehicle {

    public void print() {
        System.out.println("This is Car class");
    }
}
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("OUTPUT FOR LATE BINDINDING BY BALA SHANKAR MALLADI");
        Vehicle car = new Car();
        car.print();
        car = new Vehicle();
        car.print();
    }
}

