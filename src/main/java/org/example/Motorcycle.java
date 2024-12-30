package org.example;

public class Motorcycle extends Vehicle{
    private boolean hasSideCar;
    public Motorcycle(String vehicleId,String model,double baseRentalRate, boolean isAvailable,boolean hasSideCar){
        super  (vehicleId,model,baseRentalRate,isAvailable);
        this.hasSideCar = hasSideCar;
    }

    @Override
   public double calculateRentalCost(int days){
        return getBaseRentalRate() * days + (hasSideCar ? 10:0);

    }
}
