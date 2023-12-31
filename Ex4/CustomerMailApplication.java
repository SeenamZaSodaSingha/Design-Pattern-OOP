import java.util.Scanner;
public class CustomerMailApplication {
    /**
     * @param args the command line arguments
     */
    public static String getCustomerTypeFromUser() {
        String customerType = null;
        Scanner inp = new Scanner(System.in);
        System.out.print("Please choose customer type 1. Regular, 2. Mountain, 3. Delinquent ");
        int type = inp.nextInt();
        switch(type) {
            case 1:
                customerType = "Regular";
                break;
            case 2:
                customerType = "Mountain";
                break;
            case 3:
                customerType = "Delinquent";
                break;
        }
        inp.close();
        return customerType;
    }
    
    public static void main(String[] args) {
        String customerType = getCustomerTypeFromUser();
        Customer customer  = null;
        CustomerMailFactory factory = new CustomerMailFactory();
        customer = factory.createCustomer(customerType);
        System.out.println(customer.createMail());  
        System.out.println(customer.createBrochure());
    }
}
