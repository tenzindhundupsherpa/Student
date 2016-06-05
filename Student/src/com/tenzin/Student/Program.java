/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.Student;
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
    

