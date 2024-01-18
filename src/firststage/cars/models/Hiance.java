package firststage.cars.models;

import firststage.cars.carComponents.*;
import firststage.cars.types.Track;

import java.util.Arrays;

public class Hiance extends Track {

    private Wheel spareWheel;

    public Hiance(String color, double carPrice, Electrician electrician,
                  Engine engine, GasTank gasTank, Headlights headlights,
                  Wheel[] wheels, String country, Wheel spareWheel) {
        super(color, carPrice, electrician, engine, gasTank, headlights, wheels, country, 1488);
        this.spareWheel = spareWheel;
    }

    public Wheel getSpareWheel() {
        return spareWheel;
    }

    public void setSpareWheel(Wheel spareWheel) {
        this.spareWheel = spareWheel;
    }

    @Override
    public String toString() {
        return "Hiance{" +
                "spareWheel=" + spareWheel +
                ", transmission=" + transmission +
                ", carPrice=" + carPrice +
                ", electrician=" + electrician +
                ", engine=" + engine +
                ", gasTank=" + gasTank +
                ", headlights=" + headlights +
                ", wheel1=" + wheel1 +
                ", wheel2=" + wheel2 +
                ", wheel3=" + wheel3 +
                ", wheel4=" + wheel4 +
                ", wheels=" + Arrays.toString(wheels) +
                '}';
    }
}
