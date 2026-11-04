package org.javaDev;

public class PrimeCheck {
    public static void main(String[] args) {
        System.out.println(isPrime(13));
    }
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        int sqrt = (int) Math.sqrt(num);
        for(int i=2;i<=sqrt;i++){
            if(num%i ==0){
                return false;
            }
        }
        return true;
    }
}
