package org.example;

import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> fleet = new ArrayList<>();
    public void addVehicle(Vehicle vehicle){
        fleet.add(vehicle);
    }

    public Vehicle findVehicleById(String vehicleId){
        for (Vehicle vehicle : fleet){
            if (vehicle.getVehicleId().equals(vehicleId)){
                return vehicle;
            }
        }
        return null;
    }

    public void rentVehicle(String vehicleId,Customer customer,int days){
        Vehicle vehicle = findVehicleById(vehicleId);
        if (vehicle != null && vehicle.isAvailableForRental()) {
            customer.rentVehicle(vehicle,days);
            vehicle.setAvailable(false);
            System.out.println((customer.getName() + "rented " + vehicle));
        }else {
            System.out.println("Vehicle is unavailable or not found.");
        }
    }

    public void returnVehicle(Vehicle vehicle,Customer customer){
        customer.returnVehicle(vehicle);
        vehicle.setAvailable(true);
        System.out.println(vehicle + "has been returned.");
    }
}
