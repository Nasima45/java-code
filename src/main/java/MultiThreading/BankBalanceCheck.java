package MultiThreading;
class Account{
    private int balance=100;
    public synchronized void withdraw(String user,int amount){
        if (balance >= amount) {
            System.out.println(user + " is withdrawing " + amount);
            balance -= amount;
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println(user + " cannot withdraw — insufficient balance!");
        }
    }

}
public class BankBalanceCheck {
    static void main() {
        Account ac=new Account();
        Thread t1=new Thread(()->ac.withdraw("nasima",90));
        Thread t2=new Thread(()->ac.withdraw("kuhu",90));
        t1.start();
        t2.start();
    }


}
