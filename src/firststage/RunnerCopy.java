package firststage;

import cars.models.Camry;
import cars.models.Dyna;
import cars.models.Hiance;
import cars.models.Solara;
import carstorage.CarStorage;
import factory.Conveyor;
import factory.Factory;
import shop.Manager;

public class RunnerCopy {
    public static void main(String[] args) {
        Factory factory = new Factory("Japan");
        Conveyor conveyor = new Conveyor(factory);

        Camry camry = conveyor.createCamry("black", 10_000, "Japan", 5_000);
        Solara salora = conveyor.createSalora("white", 12_000, "Japan", 8_000);
        Dyna dyna = conveyor.createDyna("black", 15_000, "Japan", 12_000);
        Hiance hiance = conveyor.createHiance("black", 22_000, "Japan", 10_000);

        CarStorage carStorage = new CarStorage(conveyor);
        carStorage.addCamry(camry);
        carStorage.addDyna(dyna);
        carStorage.addHiance(hiance);
        carStorage.addSolara(salora);

        Manager manager = new Manager("bob");
        carStorage.checkInfo();



    }
}
