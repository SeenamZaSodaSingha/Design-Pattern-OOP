public class HeaderJob implements Job{
    
    private Header header;

    public void setHeader(Header header) {
        this.header = header;
    }

    @Override
    public void run() {
        if(this.header != null) {
            System.out.print("On button ");
            this.header.printHeader();
        }
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
