package javaCode;

import java.util.logging.Logger;


public class CodeWithMethods {
    public static final Logger logger=Logger.getLogger(CodeWithMethods.class.getName());
    public static void main(String[] args) {
        logger.info("Nasu let's do code ...");
        int year = 2000;
        int n = 8;
        logger.info(issOdd(n) ? n + " is a odd number" : n + " is a even number");
        printLeapYear(year);
        printIsPrime(5);
        reverseNumber(234);
        factorNumber(5);
        fibonacci();
        fibonacci_ForLoop();
        ArmstrongNum();

    }

    public static boolean issOdd(int a) {
        return a % 2 != 0;

    }

    public static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static void printLeapYear(int year) {
        logger.info(isLeap(year) ? year + " is a leap year" : year + " is not a leap year");
    }

    public static void printIsPrime(int n) {
        logger.info(isPrime(n) ? n + " is a prime " : n + " is not a prime");
    }

    public static void reverseNumber(int n) {
        int remainder, result = 0;

        while (n > 0) {
            remainder = n % 10;
            result = result * 10 + remainder;
            n = n / 10;
        }
        logger.info("reverse num " + result);
    }

    public static void factorNumber(int n) {
        int fact = 1;

        while (n > 0) {
            fact = fact * n;
            n--;
        }
        logger.info("Factorial num " + fact);
    }
    public static void fibonacci(){
        int first=0;
        int sec=1;
        int n;
        int count=5;
        int i=2;
        System.out.print(first +","+ sec);
        while(i<count){
            n=first+sec;
            System.out.print(","+n);
            first=sec;
            sec=n;
            i++;
        }
    }
    public static void fibonacci_ForLoop(){
        int first=0;
        int sec=1;
        int n=10;

        System.out.println("\nFibonacci Series up to " + n + " terms:");
        for(int i=1;i<=n;i++){
            System.out.print(first + " ");
            int next=first+sec;
            first=sec;
            sec=next;

        }
    }
    public static void ArmstrongNum(){
        int n=13;
        int temp=n;
        int rem;
        int result=0;
        while(n>0){
            rem=n%10;
            result=result+rem*rem*rem;
            n=n/10;

        }
        if(temp==result){
            System.out.println("is an armstrong num"+ result);
        }
        else{
            System.out.println("not");
        }

    }}
