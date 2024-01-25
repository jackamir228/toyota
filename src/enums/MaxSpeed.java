package enums;

public enum MaxSpeed {
    CAMRY_SPEED(241), SOLARA_SPEED(228), DYNA_SPEED(103), HIANCE_SPEED(172);

    private int speed;

    MaxSpeed(int speed) {
        this.speed = speed;
    }
}
