import java.util.UUID;

public class AccountService {
    public static String createAccount(String owner) {
        Account account = new Account();
        account.accountNumber = UUID.randomUUID().toString();
        account.owner = owner;
        AccountRepository.getInstance().createAccount(account);
        return account.accountNumber;
    }
    public static void getAccount(String accountNumber) {}
    public static void getAccount(int index) {}
    public static void deposit() {}
    public static void withdraw() {}
}
