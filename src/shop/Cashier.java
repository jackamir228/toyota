package shop;

import cars.Car;

public class Cashier {

    private Car[] soldCars;
    private static double income;

    public void addIncome(Car car) {
        income = car.getCarPrice();
    }
}
