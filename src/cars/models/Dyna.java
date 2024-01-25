package cars.models;

import cars.types.Truck;
import components.*;
import components.Rosette;
import exceptions.StartCarException;
import java.util.Arrays;

import static enums.Country.JAPAN;
import static enums.DirectoryCostPrice.DYNA_COST_PRICE;
import static enums.MaxSpeed.DYNA_SPEED;
import static enums.Price.DYNA_PRICE;
import static enums.Transmission.ROBOT;

public class Dyna extends Truck {

    private Rosette rosette;

    public Dyna(String color, boolean isMotionNow, Electrician electrician,
                Engine engine, GasTank gasTank, Headlights headlights,
                 Wheel[] wheels, Rosette rosette) {
        super("Dyna", color, DYNA_SPEED, isMotionNow, ROBOT, DYNA_PRICE, electrician,
                engine, gasTank, headlights, JAPAN, wheels, DYNA_COST_PRICE);
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
