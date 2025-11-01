package OOPSWork;

public class BankAccount {
    private final int accountNumber;
    private final String accountHolderName;
    private int currentBalance;

    public BankAccount(int accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public void withdraw(int money) {
        if (money > currentBalance) {
            System.out.println("you are already a beggar, earn more money");
            return;
        }
        this.currentBalance = currentBalance - money;
    }

    public void deposit(int money) {
        this.currentBalance = currentBalance + money;
    }

    public int displayBalance() {
        return currentBalance;
    }

    public void showAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + accountHolderName);
        System.out.println("Balance: " + currentBalance);
    }

    static void main() {
        BankAccount acc = new BankAccount(101, "Nasima");
        acc.showAccountDetails();

        acc.deposit(2000);
        acc.withdraw(500);
        acc.showAccountDetails();
    }
}
