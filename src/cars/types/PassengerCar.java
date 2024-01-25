package cars.types;

import components.*;
import components.CruiseСontrol;
import enums.*;
import exceptions.StartCarException;

public abstract class PassengerCar extends Car {

    protected CruiseСontrol cruiseСontrol;

    public PassengerCar(String model, String color, MaxSpeed maxSpeed, boolean isMotionNow,
                        Transmission transmission, Price price, Electrician electrician, Engine engine,
                        GasTank gasTank, Headlights headlights, Country country, Wheel[] wheels,
                        DirectoryCostPrice costPrice, CruiseСontrol cruiseСontrol) {
        super(model, color, maxSpeed, isMotionNow, transmission, price, electrician,
                engine, gasTank, headlights, country, wheels, costPrice);
        this.cruiseСontrol = cruiseСontrol;
    }

    public void turnOnCruiseControl() throws StartCarException {
        cruiseСontrol.setWorkableNow(true);
        throw new StartCarException("Круиз контроль включен");
    }

    public void turnOffCruiseControl() throws StartCarException {
        cruiseСontrol.setWorkableNow(false);
        throw new StartCarException("Круиз контроль выключен");
    }
}
