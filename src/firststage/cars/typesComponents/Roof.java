package firststage.cars.typesComponents;

public class Roof {
    private boolean isRaisedNow;

    public Roof(boolean isRaisedNow) {
        this.isRaisedNow = isRaisedNow;
    }

    public boolean isRaisedNow() {
        return isRaisedNow;
    }

    public void setRaisedNow(boolean raisedNow) {
        isRaisedNow = raisedNow;
    }
}
