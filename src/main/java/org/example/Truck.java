package org.example;

public class Truck extends Vehicle{
    private double loadCapacity;

    public Truck(String vehicleId,String model,double baseRentalRate, boolean isAvailable,double loadCapacity)
    {
        super(vehicleId,model,baseRentalRate,isAvailable);
        this.loadCapacity = loadCapacity;
    }
    @Override
    public double calculateRentalCost(int days){
        return getBaseRentalRate() * days + (loadCapacity > 1000 ? 20: 0);
    }
}
