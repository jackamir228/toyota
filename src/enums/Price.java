package enums;

public enum Price {

    CAMRY_PRICE(10_000),
    SOLARA_PRICE(12_000),
    DYNA_PRICE(15_000),
    HIANCE_PRICE(22_000);

    private double priceCar;

    Price(double priceCar) {
        this.priceCar = priceCar;
    }

    public double getPriceCar() {
        return priceCar;
    }
}
