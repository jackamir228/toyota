package firststage;

import cars.models.Camry;
import cars.models.Dyna;
import cars.models.Hiance;
import cars.models.Solara;
import carstorage.Storage;
import enums.CarModel;
import exceptions.CarNotFoundException;
import factory.Conveyor;
import factory.Factory;
import shop.Buyer;
import shop.Manager;
import shop.Report;

import java.util.Arrays;

import static enums.Country.JAPAN;

public class Runner {
    public static void main(String[] args) throws CarNotFoundException {

        Factory factory = new Factory(JAPAN);
        Conveyor conveyor = new Conveyor(factory, JAPAN);
        Report report = new Report("Ivano");
        Storage storage = new Storage(conveyor);
        Manager manager = new Manager("bob", report, factory, conveyor);

        Camry camry = conveyor.createCamry("black");
        Dyna dyna = conveyor.createDyna("black");
        Hiance hiance = conveyor.createHiance("black");
        Solara salora = conveyor.createSalora("white");

        storage.addHiance(hiance);
        storage.addCamry(camry);
        storage.addSolara(salora);
        storage.addDyna(dyna);

        Buyer buyer1 = new Buyer("a", 10_000);
        Buyer buyer2 = new Buyer("b", 12_000);
        Buyer buyer3 = new Buyer("c", 15000);
        Buyer buyer4 = new Buyer("d", 22_000);
        Buyer buyer5 = new Buyer("e", 11000);
        Buyer buyer6 = new Buyer("f", 13_000);
        Buyer buyer7 = new Buyer("g", 8_000);
        Buyer buyer8 = new Buyer("h", 30_000);

        manager.saleCar(buyer1, storage);
        manager.saleCar(buyer2, storage);
        manager.saleCar(buyer3, storage);
        manager.saleCar(buyer4, storage);
        manager.saleCar(buyer5, storage);
        manager.saleCar(buyer6, storage);
        manager.saleCar(buyer7, storage);
        manager.saleCar(buyer1, storage);





    }
}

