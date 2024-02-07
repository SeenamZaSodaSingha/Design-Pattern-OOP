public class FooterJob implements Job{
    
    private Footer footer;

    public void setFooter(Footer footer) {
        this.footer = footer;
    }

    @Override
    public void run() {
        if(this.footer != null) {
            this.footer.printFooter();
        }
    }
}
