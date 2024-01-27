package shop;

import exceptions.CarNotFoundException;
import factory.Conveyor;
import factory.Factory;
import cars.types.Car;
import carstorage.Storage;

import static enums.Country.JAPAN;
import static enums.CarModel.*;

public class Manager {

    private final String name;
    private Factory factory = new Factory(JAPAN);
    private Conveyor conveyor = new Conveyor(factory, JAPAN);
    private Report report;
    private Storage storage;

    public Manager(String name, Report report, Factory factory, Conveyor conveyor) {
        this.name = name;
        this.report = report;
        this.factory = factory;
        this.conveyor = conveyor;
    }

    public String getName() {
        return name;
    }

    public Car saleCar(Buyer buyer, Storage storage) {
        Car car = saleCarHelper(buyer);
        report.addSellCar(car);
        return car;
    }

    private Car saleCarHelper(Buyer buyer) {
        double buyerMoneyAmount = buyer.getCountMoney();

        try {
            if (buyerMoneyAmount >= HIANCE.getPriceCar() && buyerMoneyAmount >= 0) {
                return storage.removeHiance();
            } else if (buyerMoneyAmount >= DYNA.getPriceCar()) {
                return storage.removeDyna();
            } else if ((buyerMoneyAmount >= SOLARA.getPriceCar())) {
                return storage.removeSolara();
            } else if ((buyerMoneyAmount >= CAMRY.getPriceCar())) {
                return storage.removeCamry();
            }
        } catch (CarNotFoundException e) {
            return conveyor.createCar(e.getCarModel(), "black");
        }
        throw new RuntimeException("Ошибка продажи");
    }
}