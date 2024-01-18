package secondstage;

import firststage.cars.carComponents.*;
import firststage.cars.models.Camry;
import firststage.cars.models.Hiance;
import firststage.cars.models.Solara;
import firststage.cars.modelsComponents.Fridge;
import firststage.cars.modelsComponents.Rosette;
import firststage.cars.modelsComponents.UsbForCamry;
import firststage.cars.typesComponents.CruiseСontrol;
import firststage.cars.typesComponents.Roof;

public class Factory {

    private String country;

    public Factory(String country) {
        this.country = country;
    }

    public Electrician makeElectrician() {
        return new Electrician(true);
    }

    public Engine makeEngine() {
        Engine engine = new Engine(true);
        return engine;
    }

    public GasTank makeGasTank() {
        GasTank gasTank = new GasTank(0);
        return gasTank;
    }

    public Headlights makeHeadlights() {
        Headlights headlights = new Headlights(true);
        return headlights;
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
        CruiseСontrol cruiseСontrol = new CruiseСontrol(true);
        return cruiseСontrol;
    }

    public Roof makeRoof() {
        Roof roof = new Roof(false);
        return roof;
    }

    public Wheel makeSpareWheel() {
        Wheel spareWheel = new Wheel(false, 20);
        return spareWheel;
    }

    public Fridge makeFridge() {
        Fridge fridge = new Fridge(true);
        return fridge;
    }

    public Rosette makeRosette() {
        Rosette rosette = new Rosette(true);
        return rosette;
    }

    public UsbForCamry makeUsb() {
        UsbForCamry usbForCamry = new UsbForCamry(true);
        return usbForCamry;
    }

    @Override
    public String toString() {
        return "Factory{" +
                "country='" + country + '\'' +
                '}';
    }
}

