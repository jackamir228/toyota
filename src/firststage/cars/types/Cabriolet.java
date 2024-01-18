package firststage.cars.types;

import firststage.cars.Car;
import firststage.cars.carComponents.*;
import firststage.cars.typesComponents.Roof;
import firststage.exceptions.StartCarException;

import java.util.Arrays;

import static firststage.cars.carComponents.Transmission.AUTOMATIC;


public abstract class Cabriolet extends Car {

    private Roof roof;

    public Cabriolet(String color, double carPrice, Electrician electrician,
                     Engine engine, GasTank gasTank, Headlights headlights, Wheel[] wheels,
                     Roof roof, String country) {
        super(color, 130, carPrice, electrician, engine, gasTank, headlights, wheels, AUTOMATIC, country);
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

    @Override
    public String toString() {
        return "Cabriolet{" +
                "roof=" + roof +
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



