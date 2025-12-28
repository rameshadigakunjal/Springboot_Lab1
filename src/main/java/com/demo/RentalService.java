package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RentalService {

    @Autowired
    private Car car;

    @Autowired
    private Customer customer;

    public void rentCar() {
        System.out.println(customer.getCustomerDetails());
        System.out.println(car.getCarDetails());
        System.out.println("Car rented successfully!");
    }
}
