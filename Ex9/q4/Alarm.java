import java.util.ArrayList;
import java.util.List;

public class Alarm {
    private List<Object> devices = new ArrayList<>();
    private Sprinkler sprinkler;
    private CoffeePot coffeePot;

    public void add(Object device) {
        devices.add(device);
    }

    public void doAlarm() {
        System.out.println("Alarm is sending event to all...");
        for (Object device : devices) {
            if (device instanceof Sprinkler) {
                sprinkler = (Sprinkler) device;
                sprinkler.doSprinkler(this);
            } else if (device instanceof CoffeePot) {
                coffeePot = (CoffeePot) device;
                coffeePot.doCoffeePot(this);
            }
        }
    }
    public void endAlarm(String from) {
        System.out.println("Alarm event ended from " + from);
    }

}