/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Bala Shankar Malladi
 */
public class Question01 {
    public static void removeDuplicate(ArrayList<Integer> list){
    ArrayList<Integer> temp = new ArrayList<>();
    for(Integer numbers: list){
        if(!temp.contains(numbers)){
            temp.add(numbers);
        }
    }
    System.out.print("The distinct integers are ");

    for(Integer numbers:temp){
        System.out.print(numbers+" ");
    }}
    public static void main(String[] args){
    System.out.println("Output of question 1  BALA SHANKAR MALLADI");
    System.out.print("Enter ten integers: ");
    Scanner scan=new Scanner(System.in);
    ArrayList<Integer> list=new ArrayList<>();
    for(int i=0;i<10;i++){
    list.add(scan.nextInt());
    }
    removeDuplicate(list);
    }
    }
