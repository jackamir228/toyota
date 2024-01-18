package firststage.cars;

import firststage.cars.carComponents.*;
import firststage.exceptions.StartCarException;

import java.util.Arrays;

public abstract class Car {
    protected String color;
    protected double maxSpeed;
    protected boolean isMotionNow = false;
    protected Transmission transmission;
    protected double carPrice;
    protected Electrician electrician;
    protected Engine engine;
    protected GasTank gasTank;
    protected Headlights headlights;
    protected String country;

    protected Wheel wheel1;
    protected Wheel wheel2;
    protected Wheel wheel3;
    protected Wheel wheel4;
    protected Wheel[] wheels;

    public Car(String color, double maxSpeed, double carPrice,
               Electrician electrician, Engine engine, GasTank gasTank, Headlights headlights,
               Wheel[] wheels, Transmission transmission, String country) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.carPrice = carPrice;
        this.electrician = electrician;
        this.engine = engine;
        this.gasTank = gasTank;
        this.headlights = headlights;
        this.wheels = new Wheel[]{wheel1, wheel2, wheel3, wheel4};
        this.wheels = wheels;
        this.transmission = transmission;
        this.country = country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public boolean isMotionNow() {
        return isMotionNow;
    }

    public void setMotionNow(boolean motionNow) {
        isMotionNow = motionNow;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }

    public Electrician getElectrician() {
        return electrician;
    }

    public void setElectrician(Electrician electrician) {
        this.electrician = electrician;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public GasTank getGasTank() {
        return gasTank;
    }

    public void setGasTank(GasTank gasTank) {
        this.gasTank = gasTank;
    }

    public Headlights getHeadlights() {
        return headlights;
    }

    public void setHeadlights(Headlights headlights) {
        this.headlights = headlights;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public void replacementBrokenWheel(Wheel wheel) throws StartCarException {
        if (wheel.isBroken()) {
            throw new StartCarException("Заменяемое колесо проколото");
        }
        Wheel brokenWheel = null;
        for (var wheel1 : wheels) {
            if (wheel.getDiameter() != wheel1.getDiameter()) {
                throw new StartCarException("Заменяемое колесо не подходит по размеру");
            }
            brokenWheel = wheel1;
            break;
        }
        if (brokenWheel == null) {
            throw new StartCarException("Все колеса целы и не нуждаются в замене");
        }
    }

    public void start() throws StartCarException {

        for (Wheel wheel : wheels) {
            if (wheel.isBroken()) {
                throw new StartCarException("Колесо сломано");
            } else if (wheels.length < 4) {
                throw new StartCarException("Не хватает колес");
            }
        }
        if (gasTank.getFuel() <= 0) {
            throw new StartCarException("Недостаточно топлива");
        }

        if (!electrician.isWorkable()) {
            throw new StartCarException("Электроника не работоспособна");
        }

        if (!engine.isWorkable()) {
            throw new StartCarException("Двигатель не работоспособен");
        }
        setMotionNow(true);
        System.out.println("Машина стартовала");
    }

    public void stop() throws StartCarException {
        setMotionNow(false);
        throw new StartCarException("Машина остановилась");
    }

    public void turnOnHeadLights() throws StartCarException {
        if (!headlights.isWorkable()) {
            throw new StartCarException("Фары сломаны, включить невозможно");
        }
        headlights.setWorkable(true);
        throw new StartCarException("Фары включены");
    }

    public void turnOffHeadLights() throws StartCarException {
        headlights.setWorkable(false);
        throw new StartCarException("Фары выключены");
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", isMotionNow=" + isMotionNow +
                ", transmission=" + transmission +
                ", carPrice=" + carPrice +
                ", electrician=" + electrician +
                ", engine=" + engine +
                ", gasTank=" + gasTank +
                ", headlights=" + headlights +
                ", country='" + country + '\'' +
                ", wheel1=" + wheel1 +
                ", wheel2=" + wheel2 +
                ", wheel3=" + wheel3 +
                ", wheel4=" + wheel4 +
                ", wheels=" + Arrays.toString(wheels) +
                '}';
    }
}