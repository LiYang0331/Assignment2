/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author ACER
 */
public class Main {

    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("C001", "Toyota", "Corolla", 50, 4),
            new Motorcycle("M001", "Honda", "CBR 1000RR", 80, 1000),
            new Car("C002", "Ford", "Mustang", 60, 2),
            new Motorcycle("M002", "Kawasaki", "Ninja 650", 70, 650)
        };

        int rentalDays = 5;

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
            System.out.println("Rental Cost for " + rentalDays + " days: RM " + vehicle.calculateRentalCost(rentalDays));
            
            if (vehicle instanceof Motorcycle) {
                Motorcycle motorcycle = (Motorcycle) vehicle;
                System.out.println("Top Speed: " + motorcycle.calculateTopSpeed() + " km/h");
            }
            
            System.out.println();
        }
    }
}
