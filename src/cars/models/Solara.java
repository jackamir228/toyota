package cars.models;

import cars.types.Cabriolet;
import components.*;
import components.Fridge;
import components.Roof;
import exceptions.StartCarException;
import java.util.Arrays;


public class Solara extends Cabriolet {

    private final Fridge fridge;

    public Solara(String color, boolean isMotionNow, double carPrice, Electrician electrician,
                  Engine engine, GasTank gasTank, Headlights headlights, String country,
                  Wheel[] wheels, double costPrice, Roof roof, Fridge fridge) {
        super("Solara", color, isMotionNow, carPrice, electrician, engine, gasTank,
                headlights, country, wheels, costPrice, roof);
        this.fridge = fridge;
    }

    public void coolTheDrink() throws StartCarException {
        if (!fridge.isHaseble()) {
            throw new StartCarException("Холодильник сломан, охлаждение невозможно");
        }
        if (fridge.isHaseble()) {
            throw new StartCarException("Напиток охлаждается");
        }
    }

    @Override
    public String toString() {
        return "Solara{"
                +
                "fridge=" + fridge
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
