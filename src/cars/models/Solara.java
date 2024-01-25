package cars.models;

import cars.types.Cabriolet;
import components.*;
import components.Fridge;
import components.Roof;
import enums.*;
import exceptions.StartCarException;
import java.util.Arrays;

import static enums.Country.JAPAN;
import static enums.DirectoryCostPrice.SOLARA_COST_PRICE;
import static enums.MaxSpeed.SOLARA_SPEED;
import static enums.Price.SOLARA_PRICE;
import static enums.Transmission.MECHANIC;


public class Solara extends Cabriolet {

    private final Fridge fridge;

    public Solara(String color, boolean isMotionNow, Electrician electrician,
                  Engine engine, GasTank gasTank, Headlights headlights,
                  Wheel[] wheels, Roof roof, Fridge fridge) {
        super("Solara", color, SOLARA_SPEED, isMotionNow, MECHANIC, SOLARA_PRICE, electrician,
                engine, gasTank, headlights, JAPAN, wheels, SOLARA_COST_PRICE, roof);
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
                ", carPrice=" + price
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
