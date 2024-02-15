public class App {
    public static void main(String[] args) {
        Sprinkler sprinkler = new Sprinkler();
        CoffeePot coffeePot = new CoffeePot();
        Alarm alarm = new Alarm();
        alarm.add(sprinkler);
        alarm.add(coffeePot);
        alarm.doAlarm();
    }    
}
