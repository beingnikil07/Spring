package com.example.beans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name="Nikhil";

    private Vehicle vehicle;
    public Vehicle getVehicle() {
        return vehicle;
    }
    @Autowired
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


}