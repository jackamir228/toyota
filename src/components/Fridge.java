package components;

public class Fridge {
    private boolean isHaseble;

    public Fridge(boolean isHaseble) {
        this.isHaseble = isHaseble;
    }

    public boolean isHaseble() {
        return isHaseble;
    }

    public void setHaseble(boolean haseble) {
        isHaseble = haseble;
    }

    @Override
    public String toString() {
        return "Fridge{"
                +
                "isHaseble=" + isHaseble
                +
                '}';
    }
}
