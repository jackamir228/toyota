package shop;

import enums.Country;
import exceptions.SaleCarException;
import factory.Conveyor;
import factory.Factory;
import cars.types.Car;
import cars.models.Camry;
import cars.models.Dyna;
import cars.models.Hiance;
import cars.models.Solara;
import carstorage.CarStorage;

import static enums.Country.JAPAN;
import static enums.Price.*;

public class Manager {

    private final String name;
    private Factory factory = new Factory(JAPAN);
    private Conveyor conveyor = new Conveyor(factory, JAPAN);
    private Report report;

    public Manager(String name, Report report, Factory factory, Conveyor conveyor) {
        this.name = name;
        this.report = report;
        this.factory = factory;
        this.conveyor = conveyor;
    }

    public String getName() {
        return name;
    }

    public Car saleCar(Buyer buyer, CarStorage carStorage) throws SaleCarException {

        double buyerMoneyAmount = buyer.getCountMoney();

        if (carStorage != null) {
            for (Car car : carStorage.getCarStorage()) {
                if (buyerMoneyAmount >= HIANCE_PRICE.getPriceCar() && buyerMoneyAmount > DYNA_PRICE.getPriceCar()
                        && buyerMoneyAmount > SOLARA_PRICE.getPriceCar()
                        && buyerMoneyAmount > CAMRY_PRICE.getPriceCar()) {
                    return carStorage.removeHiance();

                } else if (buyerMoneyAmount >= DYNA_PRICE.getPriceCar()
                        && buyerMoneyAmount < HIANCE_PRICE.getPriceCar()
                        && buyerMoneyAmount > SOLARA_PRICE.getPriceCar()) {
                    return carStorage.removeDyna();

                } else if ((buyerMoneyAmount < DYNA_PRICE.getPriceCar())
                        && (buyerMoneyAmount == SOLARA_PRICE.getPriceCar())) {
                    return carStorage.removeSolara();

                } else if ((buyerMoneyAmount <= SOLARA_PRICE.getPriceCar())
                        && (buyerMoneyAmount == CAMRY_PRICE.getPriceCar())) {
                    return carStorage.removeCamry();
                }
            }
        }
        if (carStorage == null) {
            Hiance hiance = conveyor.createHiance("black");
            if (buyerMoneyAmount >= HIANCE_PRICE.getPriceCar()) {
                carStorage.addHiance(hiance);
            }
            if ((buyerMoneyAmount < HIANCE_PRICE.getPriceCar())
                    && (buyerMoneyAmount > DYNA_PRICE.getPriceCar())) {
                Dyna dyna = conveyor.createDyna("black");
                carStorage.addDyna(dyna);
            }
            if ((buyerMoneyAmount < DYNA_PRICE.getPriceCar())
                    && (buyerMoneyAmount > SOLARA_PRICE.getPriceCar())) {
                Solara solara = conveyor.createSalora("white");
                carStorage.addSolara(solara);
            }
            if ((buyerMoneyAmount < SOLARA_PRICE.getPriceCar())
                    && (buyerMoneyAmount > CAMRY_PRICE.getPriceCar())) {
                Camry camry = conveyor.createCamry("black");
                carStorage.addCamry(camry);
            }
            if (buyerMoneyAmount < 10_000) {
                throw new SaleCarException("Недостаточно средств");
            }
        }
        throw new SaleCarException("Не удалось выполнить продажу");
    }

    public void createFileReport(String filename) {
        report.createFileReport("C:\\Users\\pisapopa\\IdeaProjects\\toyota\\resources\\Report");
    }

}
