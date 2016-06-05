/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.Student;
import com.tenzin.Student.cap.Cap;
import com.tenzin.Student.lap.Laptop;
import com.tenzin.Student.mob.Mobile;
import java.util.Scanner;
import com.tenzin.Student.util.Student1;

/**
 *
 * @author Home
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        Mobile mobile=new Mobile();
        
        System.out.println("enter mobile id:");
        mobile.setId(input.nextInt());
        System.out.println("enter mobile name:");
        mobile.setName(input.next());
        System.out.println("enter a brand name:");
        mobile.setBrand(input.next());
        System.out.println("which colour do you want?[B/W]");
        String choice=input.next();
        if(choice.equalsIgnoreCase("b")){
            System.out.println("this is black model");
        }else
            System.out.println("this is white model");
        
        System.out.println("enter a price:");
        mobile.setAmount(input.nextFloat());
        System.out.println("enter status:");
        mobile.setStatus(input.nextBoolean());
        
        Cap cap=new Cap();
        
        System.out.println("enter cap id:");
        cap.setId(input.nextInt());
        System.out.println("enter cap name:");
        cap.setName(input.next());
        System.out.println("enter price:");
        cap.setAmount(input.nextDouble());
        System.out.println("enter status:");
        cap.setStatus(input.nextBoolean());
        
        
        Laptop laptop=new Laptop();
        
        System.out.println("enter id:");
        laptop.setId(input.nextInt());
        System.out.println("enter name:");
        laptop.setName(input.next());
        System.out.println("enter company name:");
        laptop.setCompanyName(input.next());
        System.out.println("enter price:");
        laptop.setAmount(input.nextDouble());
        System.out.println("status");
        laptop.setStatus(input.nextBoolean());
        
        
        
        
        
        Student1 student=new Student1();
       
        System.out.println("Enter your SymbolNumber:");
        student.setSymbolNumber(input.nextInt());
        System.out.println("Enter your first name:");
        student.setfName(input.next());
        System.out.println("Enter your last name:");
        student.setlName(input.next());
        System.out.println("Enter subject name:");
        student.setSubName(input.next());
        System.out.println("Enter subject code:");
        student.setSubjectCode(input.nextInt());
        System.out.println("Enter status:");   
        student.setStatus(input.nextBoolean());
       
            
              
        
    }
        
        
        
        
    }
    

