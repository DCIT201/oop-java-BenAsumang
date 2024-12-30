package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MotorcycleTest {

    private Motorcycle motorcycleWithSideCar;
    private Motorcycle motorcycleWithoutSideCar;

    @BeforeEach
    public void setUp() {
        motorcycleWithSideCar = new Motorcycle("F3 800", "Mercedes-AMG GT", 200.00, true, true);
        motorcycleWithoutSideCar = new Motorcycle("F3 800", "Mercedes-AMG GT", 200.00, true, false);
    }

    @Test
    public void testCalculateRentalCostWithSideCar() {
        double cost = motorcycleWithSideCar.calculateRentalCost(5);
        assertEquals(1010.00, cost, 0.01);
    }

    @Test
    public void testCalculateRentalCostWithoutSideCar() {
        double cost = motorcycleWithoutSideCar.calculateRentalCost(5);
        assertEquals(1000.00, cost, 0.01);
    }
}