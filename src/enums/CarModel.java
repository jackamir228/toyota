package enums;

public enum CarModel {

    CAMRY(10_000),
    SOLARA(12_000),
    DYNA(15_000),
    HIANCE(22_000);

    private double priceCar;

    CarModel(double priceCar) {
        this.priceCar = priceCar;
    }

    public double getPriceCar() {
        return priceCar;
    }
}
