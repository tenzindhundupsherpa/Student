/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.Student.util;

/**
 *
 * @author Home
 */
public class Student1 {
    private int symbolNumber,subjectCode;
    private String fName,lName,subName;
    private int date;
    private boolean status;
    
    public Student1(){
        
    }

    public Student1(int symbolNumber, int subjectCode, String fName, String lName, String subName, int date, boolean status) {
        this.symbolNumber = symbolNumber;
        this.subjectCode = subjectCode;
        this.fName = fName;
        this.lName = lName;
        this.subName = subName;
        this.date = date;
        this.status = status;
    }

    
    
    public int getSymbolNumber() {
        return symbolNumber;
    }

    public void setSymbolNumber(int symbolNumber) {
        this.symbolNumber = symbolNumber;
    }

    public int getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(int subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }  
    
    
    
}
