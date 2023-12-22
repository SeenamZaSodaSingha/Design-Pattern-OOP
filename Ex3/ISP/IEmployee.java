public class IEmployee  implements Employee, EmployeeAction, EmployeeFinance{
	public void train() {
		System.out.println("Hiring cool employee...");
	}
	public void hire() {
		System.out.println("Hiring new employee...");
	}
	public void makeDecisions() {
		System.out.println("Make decisions");
	}
	public void addStocks() {
		System.out.println("Getting shares of the company as bonus...");
	}
	public void addBonus() {
		System.out.println("Add bonus at the end of the year...");
	}
	public void salary() {
		System.out.println("Getting the salary...");
	}
}
