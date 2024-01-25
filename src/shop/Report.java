package shop;

import cars.models.Camry;
import cars.models.Dyna;
import cars.models.Hiance;
import cars.models.Solara;
import cars.types.Car;
import enums.DirectoryCostPrice;
import enums.Price;

import java.io.FileWriter;
import java.io.IOException;

public class Report {
    private final String managerName;
    private Car[] soldCars = new Car[100];
    private int countSoldCars = 0;
    private Camry camry;
    private Solara solara;
    private Dyna dyna;
    private Hiance hiance;

    String filename = "C:\\Users\\pisapopa\\IdeaProjects\\toyota\\resources\\Report";

    public Report(String managerName) {
        this.managerName = managerName;
    }

    public void addSellCar(Car car) {
        soldCars[countSoldCars] = car;
        countSoldCars++;
    }

    public void createFileReport(String filename) {
        try (FileWriter fileWriter = new FileWriter(filename)) {
            fileWriter.append(createTextReport());
        } catch (IOException e) {
            System.out.println("Невозможно записать файл");
        }
    }

    private String createTextReport() {
        StringBuilder reportBuilder = new StringBuilder();
        reportBuilder.append(managerName).append("\n");
        addCarsReport(reportBuilder);
        return reportBuilder.toString();
    }

    private void addCarsReport(StringBuilder report) {
        double camryAllIncome = 0;
        double camryAllOutcome = 0;
        for (int i = 0; i < countSoldCars; i++) {
            Car soldCar = soldCars[i];
            camryAllIncome = Price.CAMRY_PRICE.getPriceCar();
            camryAllIncome = DirectoryCostPrice.CAMRY_COST_PRICE.getCostPrice();
            report.append(camry.getModel())
                    .append(" - ")
                    .append(camry.getCarPrice())
                    .append(" - ")
                    .append(camry.getCostPrice());
        }
        report.append("Итог: доходы - ")
                .append(camryAllIncome)
                .append(", расходы - ")
                .append(camryAllOutcome)
                .append(", прибыль - ")
                .append(camryAllIncome - camryAllOutcome);
    }
}