package org.javaDev;

public class FactorialOfNumber {
    public static void main(String[] args) {
        int num =1;
        System.out.println(factorial(num));
    }
    public static int factorial(int num){
        if(num <=1){
            return 1;
        }
        int fact =1;
        while(num>1){
           fact = fact*num;
           num--;
        }
        return  fact;
    }
}
