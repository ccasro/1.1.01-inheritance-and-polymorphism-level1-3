package org.ccasro.level1.exercise1;

public class WindInstrument extends Instrument {

    public WindInstrument(String name, double price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("A wind instrument is playing.");
    }
}
