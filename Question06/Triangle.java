/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question06;

/**
 *
 * @author Bala Shankar Malladi
 */
public class Triangle extends GeometricObject{
    int side1;
    int side2;
    int side3;

    public Triangle(int side1, int side2, int side3, String color, boolean isFilled) {
        super(color, isFilled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    
    
     public double Perimeter() {
            return side1 + side2 + side3;
        }
 
        public double Area() {
            double peri = (double) Perimeter()/2;
            return Math.sqrt((peri - side1) * (peri
                    - side2) * (peri - side3));
        }

    @Override
    public String toString() {
        return " Area :" + Area() + ", Perimeter" + Perimeter() +", color :"
                +color+", is Filled :"+isFilled;
    }
      
}
