package cars.models;

import cars.types.Truck;
import components.*;

import java.util.Arrays;

import static enums.Country.JAPAN;
import static enums.DirectoryCostPrice.HIANCE_COST_PRICE;
import static enums.MaxSpeed.HIANCE_SPEED;
import static enums.CarModel.HIANCE;
import static enums.Transmission.AUTOMATIC;

public class Hiance extends Truck {

    private Wheel spareWheel;

    public Hiance(String color, boolean isMotionNow, Electrician electrician,
                  Engine engine, GasTank gasTank, Headlights headlights,
                  Wheel[] wheels, Wheel spareWheel) {
        super("Hiance", color, HIANCE_SPEED, isMotionNow, AUTOMATIC, HIANCE,
                electrician, engine, gasTank, headlights, JAPAN, wheels, HIANCE_COST_PRICE);
        this.spareWheel = spareWheel;
    }

    public Wheel getSpareWheel() {
        return spareWheel;
    }

    public void setSpareWheel(Wheel spareWheel) {
        this.spareWheel = spareWheel;
    }

    @Override
    public String toString() {
        return "Hiance{"
                +
                "spareWheel=" + spareWheel
                +
                ", color='" + color + '\''
                +
                ", maxSpeed=" + maxSpeed
                +
                ", isMotionNow=" + isMotionNow
                +
                ", transmission=" + transmission
                +
                ", carPrice=" + carModel
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
