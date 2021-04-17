/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question09;

/**
 *
 * @author Bala Shankar Malladi
 */
public class Car implements Vehicle {
    public static final String carModel="OLD";
    public static final String carType="SEDAN";
    
    public void type(){
    System.out.println("car type is "+carType);
    }
    public void model(){
    System.out.println("car model is "+carModel);
    }
}
