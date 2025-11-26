
class BankAccount {
    private String accountNumber;
    private String depositorName;
    private double balance;

    BankAccount(String accountNumber, String depositorName, double balance) {
        this.accountNumber = accountNumber;
        this.depositorName = depositorName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Depositor Name: " + depositorName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount("12345", "pratiksha", 5000.0);

        b.display();
        b.deposit(1500);
        b.withdraw(3000);
        b.display();
    }
}