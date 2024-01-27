package exceptions;

import enums.CarModel;

public class CarNotFoundException extends Exception {

    private final CarModel carModel;

    public CarNotFoundException(String message, CarModel carModel) {
        super(message);
        this.carModel = carModel;
    }

    public CarModel getCarModel() {
        return carModel;
    }
}
