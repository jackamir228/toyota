package cars.types;

import components.*;
import cars.Car;

import static enums.Transmission.ROBOT;

public abstract class Track extends Car {

    private final double CARGO_TRANSPORTATION;

    public Track(String model, String color, double maxSpeed, boolean isMotionNow,
                 double carPrice, Electrician electrician, Engine engine, GasTank gasTank, Headlights headlights,
                 String country, Wheel[] wheels,
                 double costPrice, double CARGO_TRANSPORTATION) {
        super(model, color, 103, isMotionNow, ROBOT, carPrice, electrician, engine, gasTank, headlights,
                country, wheels, costPrice);
        this.CARGO_TRANSPORTATION = CARGO_TRANSPORTATION;
    }
}
