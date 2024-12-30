package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    private Car car;

    @BeforeEach
    public void setUp() {
        car = new Car("E53", "Mercedes-AMG", 500.00, true, true);
    }

    @Test
    public void testCalculateRentalCostWithAirConditioning() {
        double cost = car.calculateRentalCost(5);
        assertEquals(2525.00, cost, 0.01);
    }

    @Test
    public void testCalculateRentalCostWithoutAirConditioning() {
        car = new Car("E53", "Mercedes-AMG", 500.00, true, false);
        double cost = car.calculateRentalCost(5);
        assertEquals(2500.00, cost, 0.01);
    }
}