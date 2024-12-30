package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class R_TransactionTest {

    private Vehicle vehicle;
    private Customer customer;
    private R_Transaction transaction;

    @BeforeEach
    void setUp() {
        vehicle = new Car("E53", "Mercedes-AMG", 500.00, true, true);
        customer = new Customer("John Doe");
        transaction = new R_Transaction(vehicle, customer, 5);
    }

    @Test
    void testGetVehicle() {
        assertEquals(vehicle, transaction.getVehicle());
    }

    @Test
    void testGetCustomer() {
        assertEquals(customer, transaction.getCustomer());
    }

    @Test
    void testGetRentalDays() {
        assertEquals(5, transaction.getRentalDays());
    }

    @Test
    void testToString() {
        String expected = "Transaction: John Doe rented Mercedes-AMG for 5 days";
        assertEquals(expected, transaction.toString());
    }
}