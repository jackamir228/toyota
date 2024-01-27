package cars.models;

import cars.types.PassengerCar;
import components.*;
import components.CruiseСontrol;
import components.UsbForCamry;
import exceptions.StartCarException;
import java.util.Arrays;

import static enums.Country.JAPAN;
import static enums.DirectoryCostPrice.CAMRY_COST_PRICE;
import static enums.MaxSpeed.CAMRY_SPEED;
import static enums.CarModel.CAMRY;
import static enums.Transmission.MECHANIC;

public class Camry extends PassengerCar {

    private UsbForCamry usb;

    public Camry(String color, boolean isMotionNow, Electrician electrician, Engine engine,
                 GasTank gasTank, Headlights headlights, Wheel[] wheels, CruiseСontrol cruiseСontrol, UsbForCamry usb) {
        super("Camry", color, CAMRY_SPEED, isMotionNow,
                MECHANIC, CAMRY, electrician, engine, gasTank,
                headlights, JAPAN, wheels, CAMRY_COST_PRICE, cruiseСontrol);
        this.usb = usb;
    }

    public void connectTheMusic() throws StartCarException {
        if (usb.isHasUsb() == true) {
            throw new StartCarException("Музыка подключена");
        }
        if (usb.isHasUsb() == false) {
            throw new StartCarException("USB не подключен, прослушивание музыки невозможно");
        }
    }

    @Override
    public String toString() {
        return "Camry{"
                +
                "usb=" + usb
                +
                ", cruiseСontrol=" + cruiseСontrol
                +
                ", color='" + color + '\''
                +
                ", maxSpeed=" + maxSpeed
                +
                ", isMotionNow=" + isMotionNow
                +
                ", transmission=" + transmission
                +
                ", carPrice=" + carModel
                +
                ", electrician=" + electrician
                +
                ", engine=" + engine
                +
                ", gasTank=" + gasTank
                +
                ", headlights=" + headlights
                +
                ", country='" + country + '\''
                +
                ", wheel1=" + wheel1
                +
                ", wheel2=" + wheel2
                +
                ", wheel3=" + wheel3
                +
                ", wheel4=" + wheel4
                +
                ", wheels=" + Arrays.toString(wheels)
                +
                ", costPrice=" + costPrice
                +
                '}';
    }
}
