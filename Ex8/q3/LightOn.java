public class LightOn implements Job{
    
    private Light light;

    public void setLight(Light light) {
        this.light = light;
    }

    @Override
    public void run() {
        if(this.light != null) {
            System.out.print("On button ");
            this.light.on();
        }
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
