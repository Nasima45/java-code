package javaCode;

import java.util.Scanner;

public class MethodIntReturn {
    static void main() {
        int sum = inputNum();
        System.out.println(sum);
    }

    static int inputNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num1:");
        int n1 = sc.nextInt();

        System.out.println("enter num2:");
        int n2 = sc.nextInt();
        return n1 + n2;

    }
}
