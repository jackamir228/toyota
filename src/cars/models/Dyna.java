package cars.models;

import cars.types.Track;
import components.*;
import components.Rosette;
import exceptions.StartCarException;
import java.util.Arrays;

public class Dyna extends Track {

    private Rosette rosette;

    public Dyna(String color, boolean isMotionNow, double price, Electrician electrician, Engine engine,
                GasTank gasTank, Headlights headlights, String country, Wheel[] wheels,
                double costPrice, Rosette rosette) {
        super("Dyna", color, 102, isMotionNow, price, electrician, engine, gasTank, headlights, country,
                wheels, costPrice, 1477);
        this.rosette = rosette;
    }

    public void chargePhone() throws StartCarException {
        if (!rosette.isHasRosette()) {
            throw new StartCarException("Розетка сломана, зарядить телефон невозможно");
        }

        if (rosette.isHasRosette() == true) {
            throw new StartCarException("Телефон заряжается");
        }
    }

    @Override
    public String toString() {
        return "Dyna{"
                +
                "rosette=" + rosette
                +
                ", color='" + color + '\''
                +
                ", maxSpeed=" + maxSpeed
                +
                ", isMotionNow=" + isMotionNow
                +
                ", transmission=" + transmission
                +
                ", carPrice=" + carPrice
                +
                ", electrician=" + electrician
                +
                ", engine=" + engine
                +
                ", gasTank=" + gasTank
                +
                ", headlights=" + headlights
                +
                ", country='" + country + '\''
                +
                ", wheel1=" + wheel1
                +
                ", wheel2=" + wheel2
                +
                ", wheel3=" + wheel3
                +
                ", wheel4=" + wheel4
                +
                ", wheels=" + Arrays.toString(wheels)
                +
                ", costPrice=" + costPrice
                +
                '}';
    }
}
