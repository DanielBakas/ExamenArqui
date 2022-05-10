import java.util.ArrayList;

public class AccountRepository {
    private static AccountRepository instance = new AccountRepository();
    ArrayList<Account> accounts;

    public static AccountRepository getInstance() { return AccountRepository.instance; }

    public void createAccount(Account account) { this.accounts.add(account); }

    public Account getAccountBy(String accountNumber) {
        Account result = null;
        for(Account account : this.accounts) {
            if(account.accountNumber == accountNumber) {
                result = account;
                break;
            }
        }
        return result;
    }

    public AccountRepository() {
        this.accounts = new ArrayList<>();
    }
}
