package Exception;

public class ExceptionTest {
    public ExceptionTest(double balance) {
        this.balance = balance;
    }

    public double balance;

    public void withdraw(int amount) throws CustomException {
        if (amount > this.balance) {
            throw new CustomException("insufficient balance...");
        }
        balance-=amount;
    }
    public void checkBalance(){
        System.out.println("current :" + balance);
    }

    static void main() {
       ExceptionTest t =new ExceptionTest(6000);
        try {
            t.withdraw(7000);
        } catch (CustomException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        t.checkBalance();
    }
}
