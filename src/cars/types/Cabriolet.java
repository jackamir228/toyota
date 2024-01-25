package cars.types;

import cars.Car;
import components.*;
import components.Roof;
import exceptions.StartCarException;

import static enums.Transmission.AUTOMATIC;

public abstract class Cabriolet extends Car {

    private Roof roof;

    public Cabriolet(String model, String color, boolean isMotionNow, double carPrice,
                     Electrician electrician, Engine engine, GasTank gasTank, Headlights headlights, String country,
                     Wheel[] wheels, double costPrice,
                     Roof roof) {
        super(model, color, 150, isMotionNow, AUTOMATIC, carPrice, electrician, engine, gasTank,
                headlights, country,
                wheels, costPrice);
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



