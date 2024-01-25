package cars.types;

import components.*;
import enums.*;
import exceptions.StartCarException;

public abstract class Car {

    protected final String model;
    protected String color;
    protected MaxSpeed maxSpeed;
    protected boolean isMotionNow;
    protected Transmission transmission;
    protected Price price;
    protected Electrician electrician;
    protected Engine engine;
    protected GasTank gasTank;
    protected Headlights headlights;
    protected Country country;
    protected Wheel wheel1;
    protected Wheel wheel2;
    protected Wheel wheel3;
    protected Wheel wheel4;
    protected Wheel[] wheels;
    protected DirectoryCostPrice costPrice;

    public Car(String model, String color, MaxSpeed maxSpeed, boolean isMotionNow, Transmission transmission,
               Price price, Electrician electrician, Engine engine, GasTank gasTank,
               Headlights headlights, Country country,
               Wheel[] wheels, DirectoryCostPrice costPrice) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.isMotionNow = isMotionNow;
        this.transmission = transmission;
        this.price = price;
        this.electrician = electrician;
        this.engine = engine;
        this.gasTank = gasTank;
        this.headlights = headlights;
        this.country = country;
        this.wheels = new Wheel[]{wheel1, wheel2, wheel3, wheel4};
        this.costPrice = costPrice;
    }

    public String getModel() {
        return model;
    }

    public DirectoryCostPrice getCostPrice() {
        return costPrice;
    }

    public Country getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public MaxSpeed getMaxSpeed() {
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

    public Price getCarPrice() {
        return price;
    }
}