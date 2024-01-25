package factory;

import components.*;
import components.Fridge;
import components.Rosette;
import components.UsbForCamry;
import components.CruiseСontrol;
import components.Roof;
import enums.Country;

public class Factory {

    private final Country country;

    public Factory(Country country) {
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }

    public Electrician makeElectrician() {
        return new Electrician(true);
    }

    public Engine makeEngine() {
        return new Engine(true);
    }

    public GasTank makeGasTank() {
        return new GasTank(0);
    }

    public Headlights makeHeadlights() {
        return new Headlights(true);
    }

    public Wheel[] makeWheels(double diameter) {
        return new Wheel[]{
                new Wheel(false, diameter),
                new Wheel(false, diameter),
                new Wheel(false, diameter),
                new Wheel(false, diameter)
        };
    }

    public CruiseСontrol makeCruiseControle() {
        return new CruiseСontrol(true);
    }

    public Roof makeRoof() {
        return new Roof(false);
    }

    public Wheel makeSpareWheel() {
        return new Wheel(false, 20);
    }

    public Fridge makeFridge() {
        return  new Fridge(true);
    }

    public Rosette makeRosette() {
        return new Rosette(true);
    }

    public UsbForCamry makeUsb() {
        return new UsbForCamry(true);
    }

    @Override
    public String toString() {
        return "Factory{"
                +
                "country='" + country + '\''
                +
                '}';
    }
}

