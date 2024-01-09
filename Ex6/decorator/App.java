
public class App {
	public static void main(String[] args) {
		Beverage plainBeverage = new PlainBeverage();
		Beverage sweetMakMakBeverage = new Sugar(new Milk(new Sugar(new Milk(new PlainBeverage()))));
		System.out.println("You order " + plainBeverage.getDescription());
		System.out.println("The cost is " + plainBeverage.getCost());
		System.out.println("-------------------------------------");
		System.out.println("You order " + sweetMakMakBeverage.getDescription());
		System.out.println("The cost is " + sweetMakMakBeverage.getCost());
	}
}
