public class App {

	public static void main(String[] args) {
		
		PaymentController controller = new PaymentController();
		controller.setPaymentMethod(new PayPal());
		controller.pay();		
	}
}
