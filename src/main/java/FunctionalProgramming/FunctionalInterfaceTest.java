package FunctionalProgramming;

@java.lang.FunctionalInterface
interface FunctionalInterface {
    abstract boolean primeCheck(int n);
}

public class FunctionalInterfaceTest implements FunctionalInterface {

    static void main() {
        int n = 8;
        int n2 = 7;
        FunctionalInterface f1 = num -> {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        };
        System.out.println(f1.primeCheck(n2));

        FunctionalInterfaceTest f = new FunctionalInterfaceTest();
        if (f.primeCheck(n)) {
            System.out.println("yes prime");
        } else {
            System.out.println("not prime");
        }
    }

    @Override
    public boolean primeCheck(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
