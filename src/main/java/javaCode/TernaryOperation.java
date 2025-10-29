package javaCode;

import java.util.Scanner;

public class TernaryOperation {
    public static void newTypeSwitch(int day) {
        String output = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Unknown day";
        };
        System.out.println("Selected day: " + output);
    }

    static void main() {
        int n1 = 7;
        int n2 = 9;

        int day = 2;
        newTypeSwitch(day);
        System.out.println("min num " + minNum(n1, n2));
        System.out.println(oddEven(n1) ? "yes even " : "not even ");
        System.out.println("my calc code : " + calculator(n1, n2));

    }

    public static int minNum(int n1, int n2) {
        return n1 < n2 ? n1 : n2;
        //return Math.min(n1,n2);
    }

    public static boolean oddEven(int n1) {
        return n1 % 2 == 0;
    }

    public static String calculator(int n1, int n2) {
        System.out.println("enter operation : ");
        Scanner sc = new Scanner(System.in);
        String operation = sc.nextLine();
        return switch (operation.toLowerCase()) {
            case "mul" -> String.valueOf(n1 * n2);
            case "add" -> String.valueOf(n1 + n2);
            case "minus" -> String.valueOf(n1 - n2);
            case "div" -> n2 != 0 ? String.valueOf(n1 / n2) : "impossible op";
            default -> "doing something wrong ";
        };

    }

    public static void doWhileOp() {
        int age;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("enter your age :");

            age = sc.nextInt();

        }
        while (age < 0 || age > 100);
        System.out.println("your age " + age);
    }
}
