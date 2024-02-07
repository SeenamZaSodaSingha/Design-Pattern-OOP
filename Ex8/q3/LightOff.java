public class LightOff implements Job {
    
    private Light light;

    public void setLight(Light light) {
        this.light = light;
    }

    @Override
    public void run() {
        if(this.light != null) {
            System.out.print("Off button ");
            this.light.off();
        }
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
