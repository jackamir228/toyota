package firststage.cars.models;

import firststage.cars.carComponents.*;
import firststage.cars.modelsComponents.Fridge;
import firststage.cars.types.Cabriolet;
import firststage.cars.typesComponents.Roof;
import firststage.exceptions.StartCarException;

import java.util.Arrays;

public class Solara extends Cabriolet {

    private Fridge fridge;

    public Solara(String color, double carPrice, Electrician electrician,
                  Engine engine, GasTank gasTank, Headlights headlights, Wheel[] wheels, Roof roof, Fridge fridge, String country) {
        super(color, carPrice, electrician, engine, gasTank, headlights, wheels, roof, country);
        this.fridge = fridge;
    }

    public void coolTheDrink() throws StartCarException {
        if (fridge.isHaseble() == false) {
            throw new StartCarException("Холодильник сломан, охлаждение невозможно");
        }
        if (fridge.isHaseble() == true) {
            throw new StartCarException("Напиток охлаждается");
        }
    }

    @Override
    public String toString() {
        return "Solara{" +
                "fridge=" + fridge +
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
