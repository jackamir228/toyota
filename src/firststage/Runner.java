package firststage;

import cars.models.Camry;
import cars.models.Dyna;
import cars.models.Hiance;
import cars.models.Solara;
import carstorage.CarStorage;
import exceptions.SaleCarException;
import factory.Conveyor;
import factory.Factory;
import shop.Buyer;
import shop.Manager;
import shop.Report;

public class Runner {
    public static void main(String[] args) throws SaleCarException {

        Factory factory = new Factory("Japan");
        Conveyor conveyor = new Conveyor(factory);

        Camry camry = conveyor.createCamry("black", 10_000, "Japan", 5_000);
        Solara salora = conveyor.createSalora("white", 12_000, "Japan", 8_000);
        Dyna dyna = conveyor.createDyna("black", 15_000, "Japan", 12_000);
        Hiance hiance = conveyor.createHiance("black", 22_000, "Japan", 10_000);

        CarStorage carStorage = new CarStorage(conveyor);
        carStorage.addCamry(camry);
        carStorage.addDyna(dyna);
        carStorage.addSolara(salora);
        carStorage.addHiance(hiance);

        Manager manager = new Manager("Ivano");
        Buyer buyer1 = new Buyer("Petr", 10000);
        Buyer buyer2 = new Buyer("Mark", 12000);
        Buyer buyer3 = new Buyer("Slava", 15000);
        Buyer buyer4 = new Buyer("Sasha", 22000);
//        Buyer buyer5 = new Buyer("Dima", 11000);
//        Buyer buyer6 = new Buyer("Armen", 13000);
//        Buyer buyer7 = new Buyer("Vova", 8000);
//        Buyer buyer8 = new Buyer("Boris", 30000);

        Report report = new Report("Alexey");

        try {
            manager.saleCar(buyer1, carStorage);
            manager.saleCar(buyer2, carStorage);
            manager.saleCar(buyer3, carStorage);
            manager.saleCar(buyer4, carStorage);
//            manager.saleCar(buyer5, carStorage);
//            manager.saleCar(buyer6, carStorage);
//            manager.saleCar(buyer7, carStorage);
//            manager.saleCar(buyer8, carStorage);
            manager.createFileReport("C:\\Users\\pisapopa\\IdeaProjects\\toyota\\resources\\Report");

        } catch (SaleCarException e) {
            e.printStackTrace();
        }
    }
}


