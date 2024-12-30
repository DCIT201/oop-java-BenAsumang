package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RentalAgencyTest {

    private RentalAgency rentalAgency;
    private Car car;
    private Customer customer;

    @BeforeEach
    void setUp() {
        rentalAgency = new RentalAgency();
        car = new Car("E53", "Mercedes-AMG", 500.00, true, true);
        customer = new Customer("John Doe");
    }

    @Test
    void addVehicle() {
        rentalAgency.addVehicle(car);
        assertEquals(car, rentalAgency.findVehicleById("E53"));
    }

    @Test
    void rentVehicle() {
        rentalAgency.addVehicle(car);
        rentalAgency.rentVehicle("E53", customer, 5);
        assertFalse(car.isAvailableForRental());
    }

    @Test
    void returnVehicle() {
        rentalAgency.addVehicle(car);
        rentalAgency.rentVehicle("E53", customer, 5);
        rentalAgency.returnVehicle(car, customer);
        assertTrue(car.isAvailableForRental());
    }
}