package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;



public class  Customer {
    private String name;
    private List<Vehicle> rentedVehicles = new ArrayList<>();
    private int loyaltyPoints;

    public Customer(String name){
        this.name = name;
    }

    public String getName(){
        return name;

    }

    public void rentVehicle(Vehicle vehicle,int days){
        rentedVehicles.add(vehicle);
        loyaltyPoints += days  * 10;
    }
    public void returnVehicle(Vehicle vehicle){
        rentedVehicles.remove(vehicle);
    }
    public int getLoyaltyPoints(){
        return loyaltyPoints;
    }

    public Collection<Vehicle> getRentedVehicles() {
        return rentedVehicles;
    }
}
