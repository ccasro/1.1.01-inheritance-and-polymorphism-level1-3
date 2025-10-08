package org.ccasro.level1.exercise1;

public class PercussionInstrument extends Instrument {
    static {
        System.out.println("PercussionInstrument class loaded (static block)");
    }

    {
        System.out.println("Instance initialization block in PercussionInstrument");
    }

    public PercussionInstrument(String name, double price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("A percussion instrument is playing");
    }
}
