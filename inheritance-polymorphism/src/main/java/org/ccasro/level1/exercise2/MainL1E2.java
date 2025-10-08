package main.java.org.ccasro.level1.exercise2;

public class MainL1E2 {
    public static void main(String[] args) {
        System.out.println("invoking static method");
        Car.brake();

        System.out.println("invoking non-static method");
        Car car = new Car("Seat", 110);
        car.accelerate();
    }
}
