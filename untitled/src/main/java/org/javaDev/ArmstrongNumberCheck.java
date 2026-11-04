package org.javaDev;

public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        System.out.println(isArmstongNum(9473));
    }

    public static boolean isArmstongNum(int num) {
        int result = 0;
        int temp = num;
        int digit = String.valueOf(num).length();
        while (num > 0) {
            int remainder = num % 10;//3 5
            result = result + (int)Math.pow(remainder,digit);
            num = num / 10;
        }
        if (temp == result) {
            return true;
        }
        return false;
    }
}
