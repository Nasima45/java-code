package org.javaDev;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(121));
    }

    public static int  sumOfDigits(int num) {
        int result = 0;
        while (num > 0) {
            int remainder = num % 10;
            result = result + remainder;
            num = num / 10;
        }
        return result;
    }
}
