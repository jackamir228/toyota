package firststage;

import firststage.cars.carComponents.*;
import firststage.cars.models.Camry;
import firststage.cars.models.Dyna;
import firststage.cars.models.Hiance;
import firststage.cars.models.Solara;
import firststage.cars.modelsComponents.Fridge;
import firststage.cars.modelsComponents.Rosette;
import firststage.cars.modelsComponents.UsbForCamry;
import firststage.cars.typesComponents.CruiseСontrol;
import firststage.cars.typesComponents.Roof;
import firststage.exceptions.StartCarException;
import fourthstage.Buyer;
import fourthstage.Manager;
import secondstage.Conveyor;
import secondstage.Factory;
import thirdstage.CarStorage;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) throws Exception {
        Conveyor conveyor = new Conveyor(new Factory("Japan"));
        CarStorage carStorage = new CarStorage(conveyor);

        Camry camry = conveyor.createCamry("black", 10_000, "Japan");
        Solara salora = conveyor.createSalora("white", 12_000, "Japan");
        Hiance hiance = conveyor.createHiance("black", 15_000, "Japan");
        Dyna dyna = conveyor.createDyna("black", 22_000, "Japan");

        carStorage.addDyna(dyna);
        carStorage.addSolara(salora);
        carStorage.addHiance(hiance);
        carStorage.addCamry(camry);
        Buyer vovan = new Buyer("vovan", 1000000000);
        Manager petr = new Manager("petr");
        petr.sale(vovan);


    }
}