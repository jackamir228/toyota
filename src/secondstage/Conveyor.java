package secondstage;

import firststage.cars.models.Camry;
import firststage.cars.models.Dyna;
import firststage.cars.models.Hiance;
import firststage.cars.models.Solara;
import thirdstage.CarStorage;

public class Conveyor {

    private Factory factory;

    public Conveyor(Factory factory) {
        this.factory = factory;
    }

    public Camry createCamry(String color, double price, String country) {
        return new Camry(
                color,
                price,
                this.factory.makeElectrician(),
                this.factory.makeEngine(),
                this.factory.makeGasTank(),
                this.factory.makeHeadlights(),
                this.factory.makeWheels(17),
                this.factory.makeCruiseControle(),
                this.factory.makeUsb(),
                country
        );
    }

    public Solara createSalora(String color, double price, String country) {
        return new Solara(
                color,
                price,
                this.factory.makeElectrician(),
                this.factory.makeEngine(),
                this.factory.makeGasTank(),
                this.factory.makeHeadlights(),
                this.factory.makeWheels(16),
                this.factory.makeRoof(),
                this.factory.makeFridge(),
                country
        );
    }

    public Dyna createDyna(String color, double price, String country) {
        return new Dyna(
                color,
                price,
                this.factory.makeElectrician(),
                this.factory.makeEngine(),
                this.factory.makeGasTank(),
                this.factory.makeHeadlights(),
                this.factory.makeWheels(20),
                country,
                this.factory.makeRosette()
        );
    }

    public Hiance createHiance(String color, double price, String country) {
        return new Hiance(
                color,
                price,
                factory.makeElectrician(),
                factory.makeEngine(),
                factory.makeGasTank(),
                factory.makeHeadlights(),
                factory.makeWheels(20),
                country,
                factory.makeSpareWheel()
        );
    }
}