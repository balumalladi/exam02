/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question03;

/**
 *
 * @author Bala Shankar Malladi
 */
public class Circle {
   int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }   
    
   public double calcArea(){
   return 3.14*radius*radius;
   }

    @Override
    public String toString() {
        return "Area of circle is " + calcArea();
    }
   
}
