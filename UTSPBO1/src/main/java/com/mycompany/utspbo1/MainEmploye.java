package com.mycompany.utspbo1;
import java.util.Scanner;

public class MainEmploye {
    public static void main(String[] args) {
      
        Employee box=new Employee("Susan Meyers",47899,"Accounting","Vice President");
        Employee box1=new Employee("Mark Jones",39199,"IT","Programmer");
        Employee box2=new Employee("Joy Rogers",81774,"Manufacturing","Engineer");
        
        System.out.println("___________________________________________________________________________________");
        System.out.println(" "+box.getName()+"   "+box.getIdnumber()+"  "+box.getDepartement()+" "+box.getPosition());
        System.out.println(" "+box1.getName()+"     "+box1.getIdnumber()+"   "+box1.getDepartement()+" "+box1.getPosition());
        System.out.println(" "+box2.getName()+"     "+box2.getIdnumber()+"   "+box2.getDepartement()+"      "+box2.getPosition());
System.out.println("___________________________________________________________________________________");
    }
}

