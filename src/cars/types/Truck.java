package cars.types;

import components.*;
import enums.*;

public abstract class Truck extends Car {

    public Truck(String model, String color, MaxSpeed maxSpeed, boolean isMotionNow, Transmission transmission,
                 CarModel carModel, Electrician electrician, Engine engine, GasTank gasTank, Headlights headlights,
                 Country country, Wheel[] wheels, DirectoryCostPrice costPrice) {
        super(model, color, maxSpeed, isMotionNow, transmission, carModel, electrician, engine, gasTank,
                headlights, country, wheels, costPrice);
    }
}
