package shop;

import cars.types.Car;
import enums.CarModel;

public class Cashier {

    private Car[] soldCars;
    private static CarModel income;

    public void addIncome(Car car) {
        income = car.getCarPrice();
    }
}
