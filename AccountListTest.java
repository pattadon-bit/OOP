package Lab1;
public class AccountListTest {
    public static void main(String[] args) {
        AccountList al = new AccountList(3);

        boolean success1 = al.appendAccount(new Account("Oak", 1.0));
        System.out.println("Append 1 success: " + success1);

        boolean success2 = al.appendAccount(new Account("Two", 0.1));
        System.out.println("Append 2 success: " + success2);

        Account account2 = al.getAccount(2);
        System.out.println("Account at index 2: " + account2);

        Account account1 = al.getAccount(1);
        System.out.println("Account 1 Balance: " + account1.getBalance()); 

        boolean success3 = al.appendAccount(new Account("tmp", 0));
        System.out.println("Append 3 success: " + success3);

        boolean success4 = al.appendAccount(new Account("tmp2", 0));
        System.out.println("Append 4 when full (should be false): " + success4);
    }
}