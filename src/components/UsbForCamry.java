package components;

public class UsbForCamry {

    private boolean isHasUsb;

    public UsbForCamry(boolean isHasUsb) {
        this.isHasUsb = isHasUsb;
    }

    public boolean isHasUsb() {
        return isHasUsb;
    }

    public void setHasUsb(boolean hasUsb) {
        isHasUsb = hasUsb;
    }

    @Override
    public String toString() {
        return "UsbForCamry{"
                +
                "isHasUsb=" + isHasUsb
                +
                '}';
    }
}
