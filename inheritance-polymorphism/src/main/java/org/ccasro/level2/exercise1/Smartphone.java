package main.java.org.ccasro.level2.exercise1;

public class Smartphone extends Phone implements Camera, Watch {

    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void takePhoto() {
        System.out.println("A photo is being taken");
    }

    @Override
    public void alarm() {
        System.out.println("The alarm is ringing");
    }
}
