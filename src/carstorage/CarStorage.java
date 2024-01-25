package carstorage;

import cars.models.Camry;
import cars.models.Dyna;
import cars.models.Hiance;
import cars.models.Solara;
import factory.Factory;
import shop.Buyer;
import factory.Conveyor;
import cars.types.Car;

public class CarStorage {

    public Car[] carStorage = new Car[100];
    private Factory factory;
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

    public Camry getCamry() {
        return camry;
    }

    public Solara getSolara() {
        return solara;
    }

    public Dyna getDyna() {
        return dyna;
    }

    public Hiance getHiance() {
        return hiance;
    }

    public void addHiance(Hiance hiance) {
        for (int i = 0; i < carStorage.length; i++) {
            if (carStorage[i] == null) {
                carStorage[i] = hiance;
                return;
            }
        }
    }

    public Car[] getCarStorage() {
        return carStorage;
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
        return null;
    }

    public Camry removeCamry() {
        for (int i = carStorage.length - 1; i >= 0; i--) {
            if (carStorage[i] != null && carStorage[i] instanceof Camry camry1) {
                carStorage[i] = null;
                return camry1;
            }
        }
        return null;
    }

    public Solara removeSolara() {
        for (int i = carStorage.length - 1; i >= 0; i--) {
            if (carStorage[i] != null && carStorage[i] instanceof Solara solara1) {
                carStorage[i] = null;
                return solara1;
            }
        }
        return null;
    }

    public Dyna removeDyna() {
        for (int i = carStorage.length - 1; i >= 0; i--) {
            if (carStorage[i] != null && carStorage[i] instanceof Dyna dyna1) {
                carStorage[i] = null;
                return dyna1;
            }
        }
        return null;
    }

    public Hiance removeHiance() {
        for (int i = carStorage.length - 1; i >= 0; i--) {
            if (carStorage[i] != null && carStorage[i] instanceof Hiance hiance1) {
                carStorage[i] = null;
                return hiance1;
            }
        }
        return null;
    }
}



