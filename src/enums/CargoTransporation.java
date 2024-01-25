package enums;

public enum CargoTransporation {
    DYNA_TRANSPORATION(1200),
    HIANCE_TRANSPORATION(1488);

    private int transporation;

    CargoTransporation(int transporation) {
        this.transporation = transporation;
    }
}
