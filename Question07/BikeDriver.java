/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question07;

import java.util.Scanner;

/**
 *
 * @author Bala Shankar Malladi
 */
public class BikeDriver {
    public static void main(String[] args){
      System.out.println("Output for question07 by BALA SHANKAR MALLADI");
      Scanner scan =new Scanner(System.in); 
      System.out.println("Choose the number of the vehicle to get the price : ");
      System.out.println("1.AVENGER");
      System.out.println("2.KAWASAKI");
      System.out.println("3.NINJA");
      int num=scan.nextInt();
      while((num!=1)&&(num!=2)&&(num!=3)){
      System.out.println("Choose the valid number : ");
      System.out.println("1.AVENGER");
      System.out.println("2.KAWASAKI");
      System.out.println("3.NINJA");
      num=scan.nextInt();
      }
      if(num==1){
      System.out.println("The price of AVENGER is 2000");
      }
      if(num==2){
      System.out.println("The price of KAWASAKI is 3000");
      }
      if(num==3){
      System.out.println("The price of NINJA is 3000");}
}
}
