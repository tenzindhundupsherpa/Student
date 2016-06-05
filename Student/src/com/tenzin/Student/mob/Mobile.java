/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.Student.mob;

/**
 *
 * @author Home
 */
public class Mobile {
    private int id;
    private String name,brand,colour;
    private float amount;
    private boolean status;

    public Mobile(){
        
    }

    public Mobile(int id, String name, String brand, String colour, float amount, boolean status) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.colour = colour;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
}
