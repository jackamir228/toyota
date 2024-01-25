package shop;

import cars.types.Car;
import enums.Price;

public class Cashier {

    private Car[] soldCars;
    private static Price income;

    public void addIncome(Car car) {
        income = car.getCarPrice();
    }
}
