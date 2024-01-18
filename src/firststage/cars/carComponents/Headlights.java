package firststage.cars.carComponents;

public class Headlights {
    private boolean isWorkable;

    public Headlights(boolean isWorkable) {
        this.isWorkable = isWorkable;
    }

    public boolean isWorkable() {
        return isWorkable;
    }

    public void setWorkable(boolean workable) {
        isWorkable = workable;
    }

    @Override
    public String toString() {
        return "Headlights{" +
                "isWorkable=" + isWorkable +
                '}';
    }
}
