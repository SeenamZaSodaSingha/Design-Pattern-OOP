public class App {
    public static void main(String[] args) {
        Employee ceo = new Employee("Settha", "CEO", 500000);
        Employee hs = new Employee("Kamphaka", "Head Sales", 300000);
        Employee hm = new Employee("UngInk", "Head Marketing", 300000);
        ceo.subordinates.add(hs);
        ceo.subordinates.add(hm);
        hs.subordinates.add(new Employee("Wiroj", "Sales", 150000));
        hs.subordinates.add(new Employee("Weeranan", "Sales", 100000));
        hm.subordinates.add(new Employee("Oak", "Marketing", 200000));
        hm.subordinates.add(new Employee("Aem", "Marketing", 250000));
        printAllEmployee(ceo);
    }

    public static void printAllEmployee(Employee ceo) {
        System.out.println(ceo);
    }
}
