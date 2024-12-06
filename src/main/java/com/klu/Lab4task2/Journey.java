package com.klu.Lab4task2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Journey {
    private Vehicle vehicle;

    @Autowired
    public Journey(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void start() {
        System.out.println("Starting the journey...");
        vehicle.move();
    }
}
