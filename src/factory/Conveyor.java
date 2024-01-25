package factory;

import cars.models.Camry;
import cars.models.Dyna;
import cars.models.Hiance;
import cars.models.Solara;

public class Conveyor {

    private Factory factory;

    public Conveyor(Factory factory) {
        this.factory = factory;
    }

    public Camry createCamry(String color, double price, String country, double costPrice) {
        return new Camry(
            color,
            true,
            price,
            this.factory.makeElectrician(),
            this.factory.makeEngine(),
            this.factory.makeGasTank(),
            this.factory.makeHeadlights(),
            country,
            this.factory.makeWheels(17),
            costPrice,
            this.factory.makeCruiseControle(),
            this.factory.makeUsb()
        );
    }

    public Solara createSalora(String color, double price, String country, double costPrice) {
        return new Solara(
                color,
                true,
                price,
                this.factory.makeElectrician(),
                this.factory.makeEngine(),
                this.factory.makeGasTank(),
                this.factory.makeHeadlights(),
                country,
                this.factory.makeWheels(16),
                costPrice,
                this.factory.makeRoof(),
                this.factory.makeFridge()
        );
    }

    public Dyna createDyna(String color, double price, String country, double costPrice) {
        return new Dyna(
                color,
                true,
                price,
                this.factory.makeElectrician(),
                this.factory.makeEngine(),
                this.factory.makeGasTank(),
                this.factory.makeHeadlights(),
                country,
                this.factory.makeWheels(20),
                costPrice,
                this.factory.makeRosette()
        );
    }

    public Hiance createHiance(String color, double price, String country, double costPrice) {
        return new Hiance(
                color,
                true,
                price,
                factory.makeElectrician(),
                factory.makeEngine(),
                factory.makeGasTank(),
                factory.makeHeadlights(),
                country,
                factory.makeWheels(20),
                costPrice,
                factory.makeSpareWheel()
        );
    }
}