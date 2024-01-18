package firststage.cars.models;

import firststage.cars.Car;
import firststage.cars.carComponents.*;
import firststage.cars.modelsComponents.Rosette;
import firststage.cars.types.Track;
import firststage.exceptions.StartCarException;

import java.util.Arrays;

public class Dyna extends Track {

    private Rosette rosette;

    public Dyna(String color, double carPrice, Electrician electrician,
                Engine engine, GasTank gasTank, Headlights headlights,
                Wheel[] wheels, String country, Rosette rosette) {
        super(color, carPrice, electrician, engine, gasTank, headlights, wheels, country, 2391);
        this.rosette = rosette;
    }

    public void chargePhone() throws StartCarException {
        if (rosette.isHasRosette() == false) {
            throw new StartCarException("Розетка сломана, зарядить телефон невозможно");
        }

        if (rosette.isHasRosette() == true) {
            throw new StartCarException("Телефон заряжается");
        }
    }

    @Override
    public String toString() {
        return "Dyna{" +
                "rosette=" + rosette +
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
