package cars.types;

import components.*;
import components.Roof;
import enums.*;
import exceptions.StartCarException;

public abstract class Cabriolet extends Car {

    private Roof roof;

    public Cabriolet(String model, String color, MaxSpeed maxSpeed, boolean isMotionNow,
                     Transmission transmission, Price price, Electrician electrician, Engine engine, GasTank gasTank,
                     Headlights headlights, Country country, Wheel[] wheels, DirectoryCostPrice costPrice, Roof roof) {
        super(model, color, maxSpeed, isMotionNow, transmission, price, electrician, engine, gasTank, headlights,
                country, wheels, costPrice);
        this.roof = roof;
    }

    public void raiseTheRoof() throws StartCarException {
        roof.setRaisedNow(true);
        throw new StartCarException("Крыша поднята");
    }

    public void letGoOfTheRoof() throws StartCarException {
        roof.setRaisedNow(false);
        throw new StartCarException("Крыша опущена");
    }
}



