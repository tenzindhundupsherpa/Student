/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.Student.cap;

/**
 *
 * @author Home
 */
public class Cap {
    private int id;
    private String name,companyName;
    private double amount;
    private boolean status;
    
    public Cap(){
        
    }

    public Cap(int id, String name, String companyName, double amount, boolean status) {
        this.id = id;
        this.name = name;
        this.companyName = companyName;
        this.amount = amount;
        this.status = status;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
    
}
