package Lab1;
public class AccountTest {
    public static void main(String[] args) {
        Account acc1 = new Account("Pattadon", 1500.0);
        System.out.println("Account Name: " + acc1.getName());
        System.out.println("Initial Balance: " + acc1.getBalance());

        Account acc2 = new Account("TestUser", -500.0);
        System.out.println("\nAccount 2 Name: " + acc2.getName());
        System.out.println("Account 2 Balance (should be 0): " + acc2.getBalance());

        acc1.deposit(500.0);
        System.out.println("\nBalance after valid deposit (1500 + 500): " + acc1.getBalance());

        acc1.deposit(-200.0);
        System.out.println("Balance after invalid deposit (should remain 2000): " + acc1.getBalance());

        acc1.setName("New Name");
        System.out.println("Updated Account Name: " + acc1.getName());
    }
}
