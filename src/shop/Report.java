package shop;

import cars.Car;

import java.io.FileWriter;
import java.io.IOException;

public class Report {
    private final String managerName;
    private Car[] soldCars = new Car[100];
    private int countCars = 0;

    String filename = "C:\\Users\\pisapopa\\IdeaProjects\\toyota\\resources\\Report";

    public Report(String managerName) {
        this.managerName = managerName;
    }

    public void sellCar(Car car) {
        soldCars[countCars] = car;
        countCars++;
    }

    public void createFileReport() {
        try (FileWriter fileWriter = new FileWriter(this.filename, true)) {
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
        double allIncome =0;
        double allOutcome = 0;
        for (Car soldCar : soldCars) {
            if (soldCar != null) {
                allIncome += soldCar.getCarPrice();
                allOutcome += soldCar.getCostPrice();
                report.append(soldCar.getModel())
                        .append(" - Доход: ")
                        .append(soldCar.getCarPrice())
                        .append(", Расход: ")
                        .append(soldCar.getCostPrice())
                        .append("\n");
            }
        }
        report.append("Итог: Доходы - ").append(allIncome)
                .append(", Расходы - ").append(allOutcome)
                .append(", Прибыль - ").append(allIncome - allOutcome);
    }
}