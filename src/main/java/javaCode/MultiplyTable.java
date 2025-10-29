package javaCode;

public class MultiplyTable {
    static void main() {
        multiply();
        oddSum();
        factorial();
        int summation=intSum();
        System.out.println(summation);
    }

    public static void multiply() {
        int n = 5;
        System.out.println("Table of " + n);
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " =" + n * i);
        }


    }

    public static void oddSum() {
        int n = 3;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("summation of odd num:" + sum);
    }
    public static void factorial() {
        int n = 3;
        int fact = 1;
        for (int i = 1; i <= n; i++) {

                fact = fact * i;

        }
        System.out.println("summation of odd num:" + fact);
    }
    public static int intSum(){
        int n=345;
        int rem,sum=0;
        while(n>0){
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        return sum;
    }

}
