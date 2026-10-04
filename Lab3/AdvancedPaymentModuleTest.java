package Lab3;
public class AdvancedPaymentModuleTest {
    public static void main(String[] args) {
        AdvancedPaymentModule apm = new AdvancedPaymentModule(0);

        Employee[] staff = new Employee[4];
        staff[0] = new Fulltimer("Alice", 30000);
        staff[1] = new Manager("Bob", 10000, 12);
        staff[2] = new Manager("Charlie", 10000, 5);
        staff[3] = new Hourly("Dave", 200, 50);

        apm.payment(staff);

        System.out.println("Advanced Payment Module Total Pay: " + apm.getTotalPay());
    }
}