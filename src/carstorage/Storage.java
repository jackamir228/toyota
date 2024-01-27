package carstorage;

import cars.models.Camry;
import cars.models.Dyna;
import cars.models.Hiance;
import cars.models.Solara;
import enums.CarModel;
import exceptions.CarNotFoundException;
import factory.Factory;
import factory.Conveyor;
import cars.types.Car;

import java.util.Arrays;

import static enums.CarModel.*;

public class Storage {

    public Car[] carStorage = new Car[10];
    private Factory factory;
    private Conveyor conveyor;
    private Camry camry;
    private Solara solara;
    private Dyna dyna;
    private Hiance hiance;

    public Storage(Conveyor conveyor) {
        this.conveyor = conveyor;
    }

    public Car[] getCarStorage() {
        return carStorage;
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
        for (Car car : carStorage) {
            if (car instanceof Camry) {
                System.out.println(car);
            }
            if (car instanceof Solara) {
                System.out.println(car);
            }
            if (car instanceof Hiance) {
                System.out.println(car);
            }
            if (car instanceof Dyna) {
                System.out.println(car);
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
        return null;
    }

    public Camry removeCamry() throws CarNotFoundException {
        for (int i = carStorage.length - 1; i >= 0; i--) {
            if (carStorage[i] != null && carStorage[i] instanceof Camry camry1) {
                carStorage[i] = null;
                return camry1;
            }
        }
        throw new CarNotFoundException("Ошибка", CAMRY);
    }

    public Solara removeSolara() throws CarNotFoundException {
        for (int i = carStorage.length - 1; i >= 0; i--) {
            if (carStorage[i] != null && carStorage[i] instanceof Solara solara1) {
                carStorage[i] = null;
                return solara1;
            }
        }
        throw new CarNotFoundException("Ошибка", SOLARA);
    }

    public Dyna removeDyna() throws CarNotFoundException {
        for (int i = carStorage.length - 1; i >= 0; i--) {
            if (carStorage[i] != null && carStorage[i] instanceof Dyna dyna1) {
                carStorage[i] = null;
                return dyna1;
            }
        }
        throw new CarNotFoundException("Ошибка", DYNA);
    }

    public Hiance removeHiance() throws CarNotFoundException {
        for (int i = carStorage.length - 1; i >= 0; i--) {
            if (carStorage[i] != null && carStorage[i] instanceof Hiance hiance1) {
                carStorage[i] = null;
                return hiance1;
            }
        }
        throw new CarNotFoundException("Ошибка", HIANCE);
    }

    @Override
    public String toString() {
        return "Storage{"
                +
                "carStorage=" + Arrays.toString(carStorage)
                +
                ", factory=" + factory
                +
                ", conveyor=" + conveyor
                +
                ", camry=" + camry
                +
                ", solara=" + solara
                +
                ", dyna=" + dyna
                +
                ", hiance=" + hiance
                +
                '}';
    }
}



