package firststage.cars.types;

import firststage.cars.Car;
import firststage.cars.carComponents.*;

import java.util.Arrays;

import static firststage.cars.carComponents.Transmission.ROBOT;

public abstract class Track extends Car {

    private final double CARGO_TRANSPORTATION;

    public Track(String color, double carPrice, Electrician electrician,
                 Engine engine, GasTank gasTank, Headlights headlights, Wheel[] wheels, String country,
                  double CARGO_TRANSPORTATION) {
        super(color, 103, carPrice, electrician, engine, gasTank, headlights, wheels, ROBOT, country);
        this.CARGO_TRANSPORTATION = CARGO_TRANSPORTATION;
    }

    @Override
    public String toString() {
        return "Track{" +
                "CARGO_TRANSPORTATION=" + CARGO_TRANSPORTATION +
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
