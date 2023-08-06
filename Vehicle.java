/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author ACER
 */
class Vehicle {
    private String vehicleNumber;
    private String manufacturer;
    private String model;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String manufacturer, String model, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.manufacturer = manufacturer;
        this.model = model;
        this.rentalRate = rentalRate;
    }

    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public String toString() {
        return "Vehicle: " + vehicleNumber + ", " + manufacturer + ", " + model;
    }
}
