package com.nams.kay.oasis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        Booking.roomCost = 1234.0f;
        SpringApplication.run(Application.class, args);
    }
}