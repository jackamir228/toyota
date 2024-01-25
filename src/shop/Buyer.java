package shop;

public class Buyer {

    private String name;
    private double countMoney;

    public Buyer(String name, double countMoney) {
        this.name = name;
        this.countMoney = countMoney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCountMoney() {
        return countMoney;
    }

    public void setCountMoney(double countMoney) {
        this.countMoney = countMoney;
    }

    @Override
    public String toString() {
        return "Buyer{"
                +
                "name='" + name + '\''
                +
                ", countMoney=" + countMoney
                +
                '}';
    }
}
