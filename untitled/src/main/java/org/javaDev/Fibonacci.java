package org.javaDev;

public class Fibonacci {
    public static void main(String[] args) {
        fibonacchi(7);
    }

    public static void fibonacchi(int num) {
        int f0 = 0, f1 = 1;
        for (int i = 0; i < num; i++) {
            System.out.print(f0+" ");
            int f3 = f0 + f1;
            f0 = f1;
            f1 = f3;
        }

    }
}
