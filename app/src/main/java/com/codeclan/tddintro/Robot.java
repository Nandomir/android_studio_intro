package com.codeclan.tddintro;

/**
 * Created by user on 13/03/2017.
 */

public class Robot {
    private String name;
    private String colour;
    private double battery;
    private String drink;

    public Robot(String name, String colour) {
        this.name = name;
        this.colour = colour;
        this.battery = 100.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getBattery() {
        return battery ;
    }

    public void setBattery(double battery) {
        this.battery = battery;
    }

    public String makeDrink(String drink) {
        this.battery -= 10;
        return "I'm making a" + drink;
    }

    public String washDishes() {
        this.battery -= 30;
        return "I am washing the dishes";
    }

    public void rechargeBattery() {
        this.battery = 100.0;
    }

}
