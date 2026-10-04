package Lab3;
public class AdvancedPaymentModule extends PaymentModule {
    public AdvancedPaymentModule(double totalPay) {
        super(totalPay);
    }

    public void payment(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            super.payment(employees[i]);
        }
    }
}
