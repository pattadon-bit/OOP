package Lab3;
public class PaymentModuleTest {
    public static void main(String[] args) {
        PaymentModule pm = new PaymentModule(0);

        Employee e1 = new Fulltimer("Alice", 30000);
        Employee e2 = new Manager("Bob", 10000, 12);
        Employee e3 = new Manager("Charlie", 10000, 5);
        Employee e4 = new Hourly("Dave", 200, 50);

        System.out.println("Testing PaymentModule:");
        
        pm.payment(e1);
        System.out.println("Paid Fulltimer (Alice): 30000 ฆTotal: " + pm.getTotalPay());

        pm.payment(e2);
        System.out.println("Paid Manager > 10 yrs (Bob): 240000 Total: " + pm.getTotalPay());

        pm.payment(e3);
        System.out.println("Paid Manager <= 10 yrs (Charlie): 50000 Total: " + pm.getTotalPay());

        pm.payment(e4);
        System.out.println("Paid Hourly (Dave): 10000 Total: " + pm.getTotalPay());
    }
}