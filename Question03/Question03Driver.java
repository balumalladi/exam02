/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question03;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Bala Shankar Malladi
 */
public class Question03Driver {
    public static void main(String[] args){
    System.out.println("Output of question 3  BALA SHANKAR MALLADI");
    ArrayList list=new ArrayList();
    String string= new String("New String");
    Date date=new Date();
    list.add(new Loan(2.0,2000));
    list.add(date);
    list.add(string);
    list.add(new Circle(5));
    
    for(Object o:list){
    System.out.println(o);
    }
    }
    
}
