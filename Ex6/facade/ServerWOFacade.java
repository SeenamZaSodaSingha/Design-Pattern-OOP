public class ServerWOFacade {
    public static void main(String[] args) {
        FacadeServer server = new FacadeServer();
		server.startServer();
		server.stopServer();
    }   
}