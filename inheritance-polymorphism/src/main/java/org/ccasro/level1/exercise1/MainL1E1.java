package org.ccasro.level1.exercise1;

public class MainL1E1 {
    public static void main(String[] args) {
        System.out.println("Class loaded by instance:");
        PercussionInstrument drum = new PercussionInstrument("Drum", 200.0);

        System.out.println("Class loaded by static member:");
        System.out.println(StringInstrument.test + "\n");

        StringInstrument guitar = new StringInstrument("Guitar", 300.0);
        WindInstrument flute = new WindInstrument("Flute", 100.0);

        PercussionInstrument triangle = new PercussionInstrument("Triangle", 50.0);

        drum.play();
        guitar.play();
        flute.play();
        triangle.play();
    }
}
