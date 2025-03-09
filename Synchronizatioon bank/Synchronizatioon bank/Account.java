public class Account {
    private String accountNumber;
    private double balance;
    private String ifscCode;

    public Account(String accountNumber, double balance, String ifscCode) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ifscCode = ifscCode;
    }
    public synchronized boolean isSufficientBalance(double amount) {
        return balance >= amount;
    }
    public synchronized void withdraw(double amount) {
        if (isSufficientBalance(amount)) {
            balance -= amount;
            System.out.println("Withdrawal successful! New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance for the withdrawal.");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getIfscCode() {
        return ifscCode;
    }
}
