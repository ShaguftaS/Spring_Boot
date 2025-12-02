package com.example.springboot.mycoolapp.Human;

public class Vehicle {

    String make;
    String model;
    int price;
    boolean fourWDrive;

    public Vehicle(String make, String model, int price, boolean fourWDrive) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.fourWDrive = fourWDrive;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public boolean isFourWDrive() {
        return fourWDrive;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setFourWDrive(boolean fourWDrive) {
        this.fourWDrive = fourWDrive;
    }
}
