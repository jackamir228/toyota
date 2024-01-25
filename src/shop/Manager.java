package shop;

import exceptions.SaleCarException;
import factory.Conveyor;
import factory.Factory;
import cars.Car;
import cars.models.Camry;
import cars.models.Dyna;
import cars.models.Hiance;
import cars.models.Solara;
import carstorage.CarStorage;

import static enums.Price.*;

public class Manager {

    private final String name;
    private final Factory factory = new Factory("Japan");
    private final Conveyor conveyor = new Conveyor(factory);
    private Report report;
    private String filename = "C:\\Users\\pisapopa\\IdeaProjects\\toyota\\resources\\Report";

    public Manager(String name) {
        this.name = name;
        this.report = new Report(name);
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
            Hiance hiance = conveyor.createHiance("black", 22_000, "Japan", 1_000);
            if (buyerMoneyAmount >= HIANCE_PRICE.getPriceCar()) {
                carStorage.addHiance(hiance);
            }
            if ((buyerMoneyAmount < HIANCE_PRICE.getPriceCar())
                    && (buyerMoneyAmount > DYNA_PRICE.getPriceCar())) {
                Dyna dyna = conveyor.createDyna("black", 15_000, "Japan", 12_000);
                carStorage.addDyna(dyna);
            }
            if ((buyerMoneyAmount < DYNA_PRICE.getPriceCar())
                    && (buyerMoneyAmount > SOLARA_PRICE.getPriceCar())) {
                Solara solara = conveyor.createSalora("white", 12_000, "Japan", 8_000);
                carStorage.addSolara(solara);
            }
            if ((buyerMoneyAmount < SOLARA_PRICE.getPriceCar())
                    && (buyerMoneyAmount > CAMRY_PRICE.getPriceCar())) {
                Camry camry = conveyor.createCamry("black", 10_000, "Japan", 5_000);
                carStorage.addCamry(camry);
            }
            if (buyerMoneyAmount < 10_000) {
                throw new SaleCarException("Недостаточно средств");
            }
        }
        throw new SaleCarException("Не удалось выполнить продажу");
    }

    public void createFileReport(String filename) {
        report.createFileReport();
    }

}
