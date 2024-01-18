package firststage.cars.types;

import firststage.cars.Car;
import firststage.cars.carComponents.*;
import firststage.cars.typesComponents.CruiseСontrol;
import firststage.exceptions.StartCarException;

import java.util.Arrays;

import static firststage.cars.carComponents.Transmission.AUTOMATIC;
import static firststage.cars.carComponents.Transmission.MECHANIC;

public abstract class PassengerCar extends Car {

    protected CruiseСontrol cruiseСontrol;


    public PassengerCar(String color, double carPrice, Electrician electrician,
                        Engine engine, GasTank gasTank, Headlights headlights, Wheel[] wheels,
                        CruiseСontrol cruiseСontrol, String country) {
        super(color, 120, carPrice, electrician, engine, gasTank, headlights, wheels, AUTOMATIC, country);
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

    @Override
    public String toString() {
        return "PassengerCar{" +
                "cruiseСontrol=" + cruiseСontrol +
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
