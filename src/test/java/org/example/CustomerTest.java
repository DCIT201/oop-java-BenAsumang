package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    private Customer customer;
    private Vehicle vehicle;

    @BeforeEach
    void setUp() {
        customer = new Customer("John Doe");
        vehicle = new Car("E53", "Mercedes-AMG", 500.00, true, true);
    }

    @Test
    void testGetName() {
        assertEquals("John Doe", customer.getName());
    }

    @Test
    void testRentVehicle() {
        customer.rentVehicle(vehicle, 5);
        assertEquals(1, customer.getRentedVehicles().size());
        assertTrue(customer.getRentedVehicles().contains(vehicle));
        assertEquals(50, customer.getLoyaltyPoints());
    }

    @Test
    void testReturnVehicle() {
        customer.rentVehicle(vehicle, 5);
        customer.returnVehicle(vehicle);
        assertEquals(0, customer.getRentedVehicles().size());
        assertFalse(customer.getRentedVehicles().contains(vehicle));
    }

    @Test
    void testGetLoyaltyPoints() {
        customer.rentVehicle(vehicle, 5);
        assertEquals(50, customer.getLoyaltyPoints());
    }
}