package org.example;

public class R_Transaction {
    private Vehicle vehicle;
    private Customer customer;
    private int rentalDays;

    public R_Transaction(Vehicle vehicle, Customer customer, int rentalDays) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.rentalDays = rentalDays;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getRentalDays() {
        return rentalDays;
    }



    @Override
    public String toString(){
        return "Transaction: " + customer.getName() + " rented " + vehicle.getModel() + " for " + rentalDays + " days";
    }
}
