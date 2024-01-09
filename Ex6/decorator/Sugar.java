public class Sugar implements Beverage {
    
    private Beverage beverage;
    
    public Sugar(Beverage beverage) {
        this.beverage = beverage;
    }
    
    public int getCost() {
        return beverage.getCost() + 1;
    }
    
    public String getDescription() {
        return beverage.getDescription() + " sugar";
    }
}
