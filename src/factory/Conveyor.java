package factory;

import cars.models.Camry;
import cars.models.Dyna;
import cars.models.Hiance;
import cars.models.Solara;
import enums.Country;

public class Conveyor {

    private Factory factory;
    private Country country;

    public Conveyor(Factory factory, Country country) {
        this.factory = factory;
        this.country = country;
    }


//    private void createGeneralDetails(Car car) {
//        car.setElectrician(factory.makeElectrician());
//        car.setEngine(factory.makeEngine());
//        car.setGasTank(factory.makeGasTank());
//        car.setHeadlights(factory.makeHeadlights());
//    }

    public Camry createCamry(String color) {
        return new Camry(color,
                false,
                this.factory.makeElectrician(),
                this.factory.makeEngine(),
                this.factory.makeGasTank(),
                this.factory.makeHeadlights(),
                this.factory.makeWheels(17),
                this.factory.makeCruiseControle(),
                this.factory.makeUsb()
        );
    }

    public Solara createSalora(String color) {
        return new Solara(
                color,
                false,
                this.factory.makeElectrician(),
                this.factory.makeEngine(),
                this.factory.makeGasTank(),
                this.factory.makeHeadlights(),
                this.factory.makeWheels(16),
                this.factory.makeRoof(),
                this.factory.makeFridge()
        );
    }

    public Dyna createDyna(String color) {
        return new Dyna(
                color,
                false,
                this.factory.makeElectrician(),
                this.factory.makeEngine(),
                this.factory.makeGasTank(),
                this.factory.makeHeadlights(),
                this.factory.makeWheels(20),
                this.factory.makeRosette()
        );
    }

    public Hiance createHiance(String color) {
        return new Hiance(
                color,
                false,
                factory.makeElectrician(),
                factory.makeEngine(),
                factory.makeGasTank(),
                factory.makeHeadlights(),
                factory.makeWheels(20),
                factory.makeSpareWheel()
        );
    }
}