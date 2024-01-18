package firststage.cars.models;

import firststage.cars.carComponents.*;
import firststage.cars.modelsComponents.UsbForCamry;
import firststage.cars.types.PassengerCar;
import firststage.cars.typesComponents.CruiseСontrol;
import firststage.exceptions.StartCarException;

import java.util.Arrays;

public class Camry extends PassengerCar {

    private UsbForCamry usb;

    public Camry(String color, double carPrice, Electrician electrician,
                 Engine engine, GasTank gasTank, Headlights headlights, Wheel[] wheels,
                 CruiseСontrol cruiseСontrol, UsbForCamry usb, String country){
        super(color, carPrice, electrician, engine, gasTank, headlights, wheels, cruiseСontrol, country);
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
        return "Camry{" +
                "usb=" + usb +
                ", cruiseСontrol=" + cruiseСontrol +
                ", transmission=" + transmission +
                ", carPrice=" + carPrice +
                ", electrician=" + electrician +
                ", engine=" + engine +
                ", gasTank=" + gasTank +
                ", headlights=" + headlights +
                ", wheel1=" + wheel1 +
                ", wheel2=" + wheel2 +
                ", wheel3=" + wheel3 +
                ", wheel4=" + wheel4 +
                ", wheels=" + Arrays.toString(wheels) +
                '}';
    }
}
