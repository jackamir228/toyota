package components;

public class Rosette {

    private boolean isHasRosette;

    public Rosette(boolean isHasRosette) {
        this.isHasRosette = isHasRosette;
    }

    public boolean isHasRosette() {
        return isHasRosette;
    }

    public void setHasRosette(boolean hasRosette) {
        isHasRosette = hasRosette;
    }

    @Override
    public String toString() {
        return "Rosette{"
                +
                "isHasRosette=" + isHasRosette
                +
                '}';
    }
}
