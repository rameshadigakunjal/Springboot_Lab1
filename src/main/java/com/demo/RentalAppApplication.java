package com.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RentalAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(RentalAppApplication.class, args);
    }

    @Bean
    CommandLineRunner run(RentalService rentalService) {
        return args -> rentalService.rentCar();
    }
}
