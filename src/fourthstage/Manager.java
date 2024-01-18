package fourthstage;

import firststage.cars.Car;
import firststage.cars.models.Camry;
import firststage.cars.models.Dyna;
import firststage.cars.models.Hiance;
import firststage.cars.models.Solara;
import secondstage.Conveyor;
import thirdstage.CarStorage;

public class Manager {

    private final String name;
    private Camry camry;
    private Solara solara;
    private Dyna dyna;
    private Hiance hiance;
    private Conveyor conveyor;
    private Car car;
    public Car[] carStorage = new Car[100];
    private CarStorage carStorages;


    public Manager(String name) {
        this.name = name;
    }

    public Car sale(Buyer buyer) throws Exception {
        for (int i = 0; i < carStorage.length; i++) {
            Car currentCar = carStorage[i];
            if (currentCar != null) {
                if (currentCar.equals(camry)
                        && camry.getCarPrice() > solara.getCarPrice()
                        && camry.getCarPrice() > dyna.getCarPrice()
                        && camry.getCarPrice() > hiance.getCarPrice()
                        && camry.getCarPrice() <= buyer.getCountMoney())
                    return camry;
                currentCar = null;
            } else if (currentCar.equals(solara)
                    && solara.getCarPrice() > camry.getCarPrice()
                    && solara.getCarPrice() > dyna.getCarPrice()
                    && solara.getCarPrice() > hiance.getCarPrice()
                    && solara.getCarPrice() <= buyer.getCountMoney()) {
                currentCar = null;
                return solara;
            }
            else if (currentCar.equals(dyna)
                    && dyna.getCarPrice() > camry.getCarPrice()
                    && dyna.getCarPrice() > solara.getCarPrice()
                    && dyna.getCarPrice() > hiance.getCarPrice()
                    && dyna.getCarPrice() <= buyer.getCountMoney()) {
                currentCar = null;
                return dyna;
            }
         else if (currentCar.equals(hiance)
                    && hiance.getCarPrice() > camry.getCarPrice()
                    && hiance.getCarPrice() > solara.getCarPrice()
                    && hiance.getCarPrice() > dyna.getCarPrice()
                    && hiance.getCarPrice() <= buyer.getCountMoney()) {
                currentCar = null;
                return hiance;
            }
            if (currentCar == null) {
                Camry camry1 = conveyor.createCamry("black", 10_000, "Japan");
                currentCar = camry1;
                carStorages.addCamry(camry1);
            }
            if (currentCar == null) {
                Solara solara1 = conveyor.createSalora("white", 12_000, "Japan");
                currentCar = solara1;
                carStorages.addSolara(solara1);
            }
            if (currentCar == null) {
                Hiance hiance1 = conveyor.createHiance("black", 15_000, "Japan");
                currentCar = hiance1;
                carStorages.addHiance(hiance1);
            }
            if (currentCar == null) {
                Dyna dyna1 = conveyor.createDyna("black", 22_000, "Japan");
                currentCar = dyna1;
                carStorages.addDyna(dyna1);
            }
            if (buyer.getCountMoney() == 0) {
                throw new Exception("Недостаточно средств");
            }
        }
        throw new Exception("Не удалось найти машину");
    }


//    public Car saleCamry(Buyer buyer) {
//        for (int i = 0; i < carStorage.length; i++) {
//            Car currentCar = carStorage[i];
//            if (currentCar != null && currentCar == camry) {
//
//
//
//                }
//
//            }
//        }
//    }
}