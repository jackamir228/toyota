package firststage;

import cars.models.Camry;
import cars.models.Dyna;
import cars.models.Hiance;
import cars.models.Solara;
import carstorage.CarStorage;
import enums.Country;
import exceptions.SaleCarException;
import factory.Conveyor;
import factory.Factory;
import shop.Buyer;
import shop.Manager;
import shop.Report;

import static enums.Country.JAPAN;

public class Runner {
    public static void main(String[] args) throws SaleCarException {

        Factory factory = new Factory(JAPAN);
        Conveyor conveyor = new Conveyor(factory, JAPAN);
        Report report = new Report("Alexey");

        Camry camry = conveyor.createCamry("black");
        Solara salora = conveyor.createSalora("white");
        Dyna dyna = conveyor.createDyna("black");
        Hiance hiance = conveyor.createHiance("black");

        CarStorage carStorage = new CarStorage(conveyor);
        carStorage.addCamry(camry);
        carStorage.addDyna(dyna);
        carStorage.addSolara(salora);
        carStorage.addHiance(hiance);

        Manager manager = new Manager("Ivano", report, factory, conveyor );
        Buyer buyer1 = new Buyer("Petr", 10000);
        Buyer buyer2 = new Buyer("Mark", 12000);
        Buyer buyer3 = new Buyer("Slava", 15000);
        Buyer buyer4 = new Buyer("Sasha", 22000);
//        Buyer buyer5 = new Buyer("Dima", 11000);
//        Buyer buyer6 = new Buyer("Armen", 13000);
//        Buyer buyer7 = new Buyer("Vova", 8000);
//        Buyer buyer8 = new Buyer("Boris", 30000);



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


