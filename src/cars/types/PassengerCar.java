package cars.types;

import cars.Car;
import components.*;
import components.CruiseСontrol;
import exceptions.StartCarException;
import static enums.Transmission.MECHANIC;

public abstract class PassengerCar extends Car {

    protected CruiseСontrol cruiseСontrol;

    public PassengerCar(String model, String color, boolean isMotionNow, double carPrice,
                        Electrician electrician, Engine engine, GasTank gasTank, Headlights headlights, String country,
                        Wheel[] wheels, double costPrice,
                        CruiseСontrol cruiseСontrol) {
        super(model, color, 120, isMotionNow, MECHANIC, carPrice, electrician, engine,
                gasTank, headlights, country, wheels, costPrice);
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
