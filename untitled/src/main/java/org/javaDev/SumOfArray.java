package org.javaDev;

public class SumOfArray {
    public static void main(String[] args) {
        int arr[] = {3, 2, 1, 4};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
        oddEven(13);
        findLargest();
        System.out.println(reverseNumber());
        System.out.println(isPalindrome());
    }

    public static void oddEven(int num) {
        String result = num % 2 != 0 ? "odd" : "even";
        System.out.println(result);
    }

    public static void findLargest() {
        int a = 3, b = 7, c = 9;
        int max = a;
        if (a > b && a > c) {
            max = a;
        }
        if (b > a && b > c) {
            max = b;
        }
        if (c > a && c > b) {
            max = c;
        }
        System.out.println(max);
    }

    public static int reverseNumber() {
        int num = 234;
        int rev = 0;
        while (num > 0) {
            int remainder = num % 10;//4
            rev = rev * 10 + remainder;//40+3=43//430+
            num = num / 10;
        }
        return rev;
    }

    public static boolean isPalindrome() {
        int num = 1331;
        int rev = 0;
        int temp = num;
        while (num > 0) {
            int remainder = num % 10;//4
            rev = rev * 10 + remainder;//40+3=43//430+
            num = num / 10;
        }
        boolean result = temp == rev ? true : false;
        return result;

    }
}
