package firststage.cars.carComponents;

public class Electrician {
    private boolean isWorkable;

    public Electrician(boolean isWorkable) {
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
        return "Electrician{" +
                "isWorkable=" + isWorkable +
                '}';
    }
}
