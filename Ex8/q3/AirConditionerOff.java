public class AirConditionerOff implements Job{

    private AirConditioner ac;

    public void setAirConditioner(AirConditioner ac) {
        this.ac = ac;
    }

    // @Override
    public void run() {
        if(this.ac != null) {
            System.out.print("Off button ");
            this.ac.off();
        }
        
        // try {
        //     Thread.sleep(1000);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }   
    }
}
