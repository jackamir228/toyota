package shop;

import cars.models.Camry;
import cars.models.Dyna;
import cars.models.Hiance;
import cars.models.Solara;
import cars.types.Car;
import enums.CarModel;
import enums.DirectoryCostPrice;


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
        double allIncome = 0;
        double allOutcome = 0;

        for (Car soldCar : soldCars) {
            if (soldCar != null) {

                report.append(soldCar.getModel())
                        .append(" - Доход: ")
                        .append(soldCar.getCarPrice())
                        .append(", Расход: ")
                        .append(soldCar.getCostPrice())
                        .append("\n");

                switch (soldCar.getCarPrice()) {
                    case HIANCE -> {
                        allIncome += CarModel.HIANCE.getPriceCar();
                    }
                    case DYNA -> {
                        allIncome += CarModel.DYNA.getPriceCar();
                    }
                    case SOLARA -> {
                        allIncome += CarModel.SOLARA.getPriceCar();
                    }
                    case CAMRY -> {
                        allIncome += CarModel.CAMRY.getPriceCar();
                    }
                }

                switch (soldCar.getCostPrice()) {
                    case HIANCE_COST_PRICE -> {
                        allOutcome += DirectoryCostPrice.HIANCE_COST_PRICE.getCostPrice();
                    }
                    case DYNA_COST_PRICE -> {
                        allOutcome += DirectoryCostPrice.DYNA_COST_PRICE.getCostPrice();
                    }
                    case SOLARA_COST_PRICE -> {
                        allOutcome += DirectoryCostPrice.SOLARA_COST_PRICE.getCostPrice();
                    }
                    case CAMRY_COST_PRICE -> {
                        allOutcome += DirectoryCostPrice.CAMRY_COST_PRICE.getCostPrice();
                    }
                }
            }
        }
        report.append("Итог: Доходы - ").append(allIncome)
                .append(", Расходы - ").append(allOutcome)
                .append(", Прибыль - ").append(allIncome - allOutcome);

    }
}
