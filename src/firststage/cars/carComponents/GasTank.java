package firststage.cars.carComponents;

public class GasTank {
    private double fuel;

    public GasTank(double fuel) {
        this.fuel = fuel;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "GasTank{" +
                "fuel=" + fuel +
                '}';
    }
}
