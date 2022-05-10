public class Account {
    String accountNumber;
    Float balance;
    String owner;

    public String getAccountNumber() { return this.accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    public Float getBalance() { return this.balance; }
    public void setBalance(Float balance) { this.balance = balance; }

    public String getOwner() { return owner; }
    public void setOwner(String owner) { this.owner = owner;}

    public String toString() {
        String result = "Account:\n";
        result += String.format("- accountNumber: %s\n", this.accountNumber);
        result += String.format("- balance: %s\n", this.balance);
        result += String.format("- owner: %s\n", this.owner);
        return result;
    }

    public Account(String accountNumber, Float balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Account() {
        this.balance = 0.0f;
    }
}
