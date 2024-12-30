package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TruckTest {

    private Truck truckWithHighLoadCapacity;
    private Truck truckWithLowLoadCapacity;

    @BeforeEach
    public void setUp() {
        truckWithHighLoadCapacity = new Truck("T1000", "Volvo FH", 300.00, true, 1500);
        truckWithLowLoadCapacity = new Truck("T2000", "Volvo FH", 300.00, true, 800);
    }

    @Test
    void testCalculateRentalCostWithHighLoadCapacity() {
        double cost = truckWithHighLoadCapacity.calculateRentalCost(5);
        assertEquals(1520.00, cost, 0.01);
    }

    @Test
    void testCalculateRentalCostWithLowLoadCapacity() {
        double cost = truckWithLowLoadCapacity.calculateRentalCost(5);
        assertEquals(1500.00, cost, 0.01);
    }
}