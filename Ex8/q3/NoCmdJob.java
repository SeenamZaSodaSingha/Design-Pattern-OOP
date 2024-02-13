public class NoCmdJob implements Job{
    
    private NoCmd btn;

    public void setCmd(NoCmd btn) {
        this.btn = btn;
    }

    @Override
    public void run() {
        if(this.btn != null) {
            this.btn.noCommand();
        }
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
