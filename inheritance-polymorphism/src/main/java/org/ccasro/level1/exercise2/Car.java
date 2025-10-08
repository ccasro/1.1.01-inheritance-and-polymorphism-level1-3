package org.ccasro.level1.exercise2;

public class Car {
    private static final String brand = "Seat";
    private static String model;
    private final int power;

    public Car(String model, int power) {
        Car.model = model;
        this.power = power;
    }

    public static void brake() {
        System.out.println("The vehicle is braking");
    }

    public void accelerate() {
        System.out.println("The vehicle is accelerating");
    }
}
