package firststage.cars.carComponents;

public class Wheel {

    private boolean isBroken;
    private double diameter;

    public Wheel(boolean isBroken, double diameter) {
        this.isBroken = isBroken;
        this.diameter = diameter;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Wheel{" + "isBroken=" + isBroken + ", diameter=" + diameter + '}';
    }
}

