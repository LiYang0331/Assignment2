/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

class Motorcycle extends Vehicle {
    private double engineCapacity;

    public Motorcycle(String vehicleNumber, String manufacturer, String model, double rentalRate, double engineCapacity) {
        super(vehicleNumber, manufacturer, model, rentalRate);
        this.engineCapacity = engineCapacity;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public double calculateTopSpeed() {
        return engineCapacity * 50;
    }

    public double calculateRentalCost(int days) {
        double cost = super.calculateRentalCost(days);
        if (calculateTopSpeed() >= 300) {
            cost += 150;
        }
        return cost;
    }

    public String toString() {
        return super.toString() + ", Engine Capacity: " + engineCapacity;
    }
}
