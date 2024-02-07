public class Remote {
    public static void main(String[] args) {
        init();
    }

    private static void init() {
        ThreadPool pool = new ThreadPool(1);

        Light lightBedRoomLight = null;
        LightOn lightOnBedroom = new LightOn();
        LightOff lightOffBedroom = new LightOff();

        Light lightKitchenLight = null;
        LightOn lightOnKitchen = new LightOn();
        LightOff lightOffKitchen = new LightOff();

        AirConditioner ac = null;
        AirConditionerOn acOn = new AirConditionerOn();
        AirConditionerOff acOff = new AirConditionerOff();

        Header sw0 = new Header("slot 0, light Bed Room");
        HeaderJob sw0j = new HeaderJob();
        sw0j.setHeader(sw0);

        Header sw1 = new Header("slot 1, light Kitchen");
        HeaderJob sw1j = new HeaderJob();
        sw1j.setHeader(sw1);

        Header sw2 = new Header("slot 2, AC Bedroom");
        HeaderJob sw2j = new HeaderJob();
        sw2j.setHeader(sw2);

        Header sw3 = null;

        Footer fsw0 = new Footer("---------------------------------");
        FooterJob fsw0j = new FooterJob();
        fsw0j.setFooter(fsw0);

        Footer fsw1 = new Footer("---------------------------------");
        FooterJob fsw1j = new FooterJob();
        fsw1j.setFooter(fsw1);

        Footer fsw2 = new Footer("---------------------------------");
        FooterJob fsw2j = new FooterJob();
        fsw2j.setFooter(fsw2);

        Footer fsw3 = null;

        lightBedRoomLight = new Light("Bedroom");
        lightOnBedroom.setLight(lightBedRoomLight);
        lightOffBedroom.setLight(lightBedRoomLight);

        lightKitchenLight = new Light("Kitchen");
        lightOnKitchen.setLight(lightKitchenLight);
        lightOffKitchen.setLight(lightKitchenLight);

        ac = new AirConditioner("Bedroom");
        acOn.setAirConditioner(ac);
        acOff.setAirConditioner(ac);

        pool.addJob(sw0j);
        pool.addJob(lightOnBedroom);
        pool.addJob(lightOffBedroom);
        pool.addJob(fsw0j);

        pool.addJob(sw1j);
        pool.addJob(lightOnKitchen);
        pool.addJob(lightOffKitchen);
        pool.addJob(fsw1j);

        pool.addJob(sw2j);
        pool.addJob(acOn);
        pool.addJob(acOff);
        pool.addJob(fsw2j);

        pool.shutdownPool();
    }

}
