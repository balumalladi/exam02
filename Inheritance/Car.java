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
public class Car extends Vehicle{
    String model;
    String name;

    public Car(String model, String name, String type) {
        super(type);
        this.model = model;
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Car Details"+"\n" + "Model :" + model +"\n"+ "Name :" + name ;
    }
    
    
}
