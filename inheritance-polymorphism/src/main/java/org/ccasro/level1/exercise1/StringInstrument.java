package org.ccasro.level1.exercise1;

public class StringInstrument extends Instrument {
    static {
        System.out.println("StringInstrument class loaded (static block)");
    }

    {
        System.out.println("Instance initialization block in StringInstrument");
    }

    public static String test = "String instrument static test";

    public StringInstrument(String name, double price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("A string instrument is playing");
    }
}
