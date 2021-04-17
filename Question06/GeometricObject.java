/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question06;

import java.util.Scanner;

/**
 *
 * @author Bala Shankar Malladi
 */
public abstract class GeometricObject {
        String color;
        boolean isFilled;

    public GeometricObject(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isIsFilled() {
        return isFilled;
    }

    public void setIsFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

        @Override
        public String toString() {
            return ", Color :" + color + ", isFilled :" + isFilled;
        }
        public abstract double Perimeter();
        public abstract double Area();
    }

     
  

