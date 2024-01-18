package thirdstage;

import firststage.cars.models.Camry;
import firststage.cars.models.Dyna;
import firststage.cars.models.Hiance;
import firststage.cars.models.Solara;
import firststage.exceptions.StartCarException;
import fourthstage.Buyer;
import secondstage.Conveyor;
import firststage.cars.Car;

import java.util.Arrays;

public class CarStorage {

    public Car[] carStorage = new Car[100];

    private Conveyor conveyor;

    private Camry camry;

    private Solara solara;

    private Dyna dyna;

    private Hiance hiance;
    private Buyer buyer;

    public CarStorage(Conveyor conveyor) {
        this.conveyor = conveyor;
    }

    public void addCamry(Camry camry) {
        for (int i = 0; i < carStorage.length; i++) {
            if (carStorage[i] == null) {
                carStorage[i] = camry;
                return;
            }
        }
    }

    public void addSolara(Solara solara) {
        for (int i = 0; i < carStorage.length; i++) {
            if (carStorage[i] == null) {
                carStorage[i] = solara;
                return;
            }
        }
    }

    public void addHiance(Hiance hiance) {
        for (int i = 0; i < carStorage.length; i++) {
            if (carStorage[i] == null) {
                carStorage[i] = hiance;
                return;
            }
        }
    }

    public void addDyna(Dyna dyna) {
        for (int i = 0; i < carStorage.length; i++) {
            if (carStorage[i] == null) {
                carStorage[i] = dyna;
                return;
            }
        }
    }

    public void checkInfo() {
        for (int i = 0; i < carStorage.length; i++) {
            if (carStorage[i] instanceof Camry) {
                System.out.println(carStorage[i]);
            }
            if (carStorage[i] instanceof Solara) {
                System.out.println(carStorage[i]);
            }
            if (carStorage[i] instanceof Hiance) {
                System.out.println(carStorage[i]);
            }
            if (carStorage[i] instanceof Dyna) {
                System.out.println(carStorage[i]);
            }
        }
    }

    public Car removeFromStorage() {
        for (int i = carStorage.length - 1; i >= 0; i--) {
            if (carStorage[i] != null) {
                var car = carStorage[i];
                carStorage[i] = null;
                return car;
            }
        }
        throw new RuntimeException("Машин не было");
    }
}



