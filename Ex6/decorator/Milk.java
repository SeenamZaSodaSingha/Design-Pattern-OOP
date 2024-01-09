public class Milk implements Beverage {

    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public int getCost() {
        return beverage.getCost() + 3;
    }

    public String getDescription() {
        return beverage.getDescription() + " milk";
    }
}
