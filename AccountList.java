package Lab1;
public class AccountList {
    private Account[] accounts;
    private int count; 

        public AccountList(int maxSize) {
            accounts = new Account[maxSize];
            count = 0;
        }
        public boolean appendAccount(Account acc) {
            if (count < accounts.length) {
                accounts[count] = acc;
                count++;
                return true;
            }
            return false; 
        }
        public Account getAccount(int idx) {
            if (idx >= 0 && idx < count) {
                return accounts[idx];
            } else {
                System.out.println("Input index exceeds the number of appended elements");
                return null;
            }
        }
}