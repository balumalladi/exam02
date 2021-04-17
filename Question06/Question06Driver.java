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
public class Question06Driver {
  public static void main(String[] args) {
        System.out.println("Output of Question 06 BALA SHANKAR MALLADI");
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter side1 ");
        int side1 = scan.nextInt();
        System.out.print("Enter side2 ");
        int side2 = scan.nextInt();
        System.out.print("Enter side3 ");
        int side3 = scan.nextInt();
        System.out.print("Enter color ");
        scan.nextLine();
        String color = scan.nextLine();
        System.out.print("Is filled ");
        boolean isFilled = scan.nextBoolean();
        scan.close();
        Triangle triangle = new Triangle(side1, side2, side3, color, isFilled);
        System.out.println(triangle.toString());
    }  
}
