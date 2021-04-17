/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question05;

/**
 *
 * @author Bala Shankar Malladi
 */
public class Question05Driver {
    public static void main(String[] args){
    System.out.println("Output of question05 by BALA SHANKAR MALLADI");
    Person person=new Person("Malladi","maryville",917795,"malladi@gmail.com");
    Student student=new Student('A',"Balu","maryville",370,"balu@gmail.com");
    Employee employee=new Employee(" ",0 ,null ,"shankar","Missouri",660528,
            "shankar@gmail.com");
    Faculty faculty=new Faculty(10,2," ",2000,null,"Harsha","Missouri",660528,
            "harsha@gmail.com");
    Staff staff=new Staff(" "," ",20,null,"kurra","kansas",876533,"kurra@gmail.com");
    
    System.out.println(person.toString());
    System.out.println(student.toString());
    System.out.println(employee.toString());
    System.out.println(faculty.toString());
    System.out.println(staff.toString());
    }
}
