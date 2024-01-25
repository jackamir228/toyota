package enums;

public enum DirectoryCostPrice {
    CAMRY_COST_PRICE(5000),
    HIANCE_COST_PRICE(10_000),
    DYNA_COST_PRICE(12_000),
    SOLARA_COST_PRICE(8_000);

    private final double costPrice;

    DirectoryCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public double getCostPrice() {
        return costPrice;
    }
}
