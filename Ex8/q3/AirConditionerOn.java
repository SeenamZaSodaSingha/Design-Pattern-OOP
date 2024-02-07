public class AirConditionerOn implements Job {

    private AirConditioner ac;

    public void setAirConditioner(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void run() {
        if(this.ac != null) {
            System.out.print("On button ");
            this.ac.on();
            this.ac.setTemp(25);
        }
        
        // try {
        //     Thread.sleep(1000);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }        
    }
    
}
