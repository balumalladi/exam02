/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

/**
 *
 * @author Bala Shankar Malladi
 */
public class Vehicle {
    
    public static class vehicles{
    public void type(){
    };
    public void model(){
    };
    }
    public static class Bikes extends vehicles{
    public static final String bikeModel="NEW";
    public static final String bikeType="Avenger";
    
    public void type(){
    System.out.println("Bike type is "+bikeType);
    }
    public void model(){
    System.out.println("Bike model is "+bikeModel);
    }

        @Override
        public String toString() {
            return "Bikes class";
        }
    
    }
    public static class cars extends vehicles{
    public static final String carModel="OLD";
    public static final String carType="SEDAN";
    
    public void type(){
    System.out.println("car type is "+carType);
    }
    public void model(){
    System.out.println("car model is "+carModel);
    }

        @Override
        public String toString() {
            return "cars class";
        }
    
    }
     public static void main(String[] args){
         System.out.println("OUTPUT OF POLYMORPHISM BY BALA SHANKAR MALLADI");
    //Question09.Bike bike=new Question09.Bike();
    //Question09.Car car =new Question09.Car();
    //car.model();
    //bike.type();
    vehicles v1= new cars();
         System.out.println(v1);
    }
}
