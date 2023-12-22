public class App {
    public static void main(String[] args) {
        IEmployee employee = new IEmployee();
        employee.hire();
        employee.train();
        employee.makeDecisions();
        employee.addStocks();
        employee.addBonus();
        employee.salary();
    }
}
