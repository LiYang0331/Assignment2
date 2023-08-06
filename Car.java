/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author ACER
 */
class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String vehicleNumber, String manufacturer, String model, double rentalRate, int numberOfDoors) {
        super(vehicleNumber, manufacturer, model, rentalRate);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public double calculateRentalCost(int days) {
        double cost = super.calculateRentalCost(days);
        if (numberOfDoors > 2) {
            cost += 35 * days;
        }
        return cost;
    }

    public String toString() {
        return super.toString() + ", Doors: " + numberOfDoors;
    }
}
