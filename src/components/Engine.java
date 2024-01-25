package components;

public class Engine {
    private boolean isWorkable;

    public Engine(boolean isWorkable) {
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
        return "Engine{"
                +
                "isWorkable=" + isWorkable
                +
                '}';
    }
}
