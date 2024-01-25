package cars.models;

import cars.types.PassengerCar;
import components.*;
import components.CruiseСontrol;
import components.UsbForCamry;
import exceptions.StartCarException;
import java.util.Arrays;

public class Camry extends PassengerCar {

    private UsbForCamry usb;

    public Camry(String color, boolean isMotionNow, double price, Electrician electrician, Engine engine,
                 GasTank gasTank, Headlights headlights, String country, Wheel[] wheels, double costPrice,
                 CruiseСontrol cruiseСontrol,
                 UsbForCamry usb) {
        super("Camry", color, isMotionNow, price, electrician, engine, gasTank, headlights, country,
                wheels, costPrice, cruiseСontrol);
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
                ", carPrice=" + carPrice
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
