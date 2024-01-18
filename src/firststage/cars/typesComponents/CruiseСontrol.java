package firststage.cars.typesComponents;

public class CruiseСontrol {
    private boolean isWorkableNow;

    public CruiseСontrol(boolean isWorkableNow) {
        this.isWorkableNow = isWorkableNow;
    }

    public boolean isWorkableNow() {
        return isWorkableNow;
    }

    public void setWorkableNow(boolean workableNow) {
        isWorkableNow = workableNow;
    }
}

