public class Customer {
    private String name;
    private Account account;
    private String address;

    public Customer(String name, Account account, String address) {
        this.name = name;
        this.account = account;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }

    public String getAddress() {
        return address;
    }

    public void withdrawAmount(double amount) {
        account.withdraw(amount);
    }
}
