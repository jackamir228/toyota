package cars.models;

import cars.types.Track;
import components.*;
import java.util.Arrays;

public class Hiance extends Track {

    private Wheel spareWheel;

    public Hiance(String color, boolean isMotionNow, double carPrice, Electrician electrician,
                  Engine engine, GasTank gasTank, Headlights headlights, String country, Wheel[] wheels,
                  double costPrice, Wheel spareWheel) {
        super("Hiance", color, 102, isMotionNow, carPrice, electrician, engine, gasTank, headlights,
                country, wheels, costPrice, 1477);
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
        return "Hiance{"
                +
                "spareWheel=" + spareWheel
                +
                ", color='" + color + '\''
                +
                ", maxSpeed=" + maxSpeed
                +
                ", isMotionNow=" + isMotionNow
                +
                ", transmission=" + transmission
                +
                ", carPrice=" + carPrice
                +
                ", electrician=" + electrician
                +
                ", engine=" + engine
                +
                ", gasTank=" + gasTank
                +
                ", headlights=" + headlights
                +
                ", country='" + country + '\''
                +
                ", wheel1=" + wheel1
                +
                ", wheel2=" + wheel2
                +
                ", wheel3=" + wheel3
                +
                ", wheel4=" + wheel4
                +
                ", wheels=" + Arrays.toString(wheels)
                +
                ", costPrice=" + costPrice
                +
                '}';
    }
}
