public class main {
    public static void main(String[] args) {
        Account account = new Account("12345", 5000.0, "IFSC001");
        Customer customer1 = new Customer("Alice", account, "1234 Elm Street");
        Customer customer2 = new Customer("Bob", account, "5678 Oak Avenue");
        Thread t1 = new Thread(() -> {
            customer1.withdrawAmount(3000.0); 
        });

        Thread t2 = new Thread(() -> {
            customer2.withdrawAmount(2500.0); 
        });
        t1.start();
        t2.start();
        
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
