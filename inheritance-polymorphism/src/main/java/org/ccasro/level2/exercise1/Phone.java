package main.java.org.ccasro.level2.exercise1;

public class Phone {
    private String brand;
    private String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void call(String phoneNumber) {
        System.out.println("Calling number " + phoneNumber);
    }
}
