package javaCode;

import java.util.Scanner;

public class Recursion {
    static void main() {
       int n = 5;
        System.out.println(factNum(n));
        System.out.println("occurred:  " + Occ() + "times");
        Scanner sc =new Scanner(System.in);
        System.out.println("enter pass : ");
        int input=sc.nextInt();
        correctPassword(input,sc);
        System.out.println("enter word : ");
        String word=sc.nextLine();
        breakUses(word,sc);
        System.out.println("summation: "+ positiveSum());
        String name="madam";
        for(int i=0;i<=n;i++){
            System.out.println("series: "+ fibonacci(i));
        }
        System.out.println(isPalindrome(name) ? "pal" : "not pal") ;

    }

    public static int factNum(int n) {
        if (n == 1) {
            return n;
        }
        return n * factNum(n - 1);
    }

    public static int Occ() {
        int arr[] = {6, 7, 6, 5, 8, 6};
        int count = 0;

//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 5) {
//
//                count++;
//            }
//        }

        for (int x : arr) {
            if (x == 6) {

                count++;
            }
        }
        return count;
    }

    public static void  correctPassword(int input, Scanner sc){

        int pass=123;

        while(pass!=input)
        {System.out.println("enter again : ");
            input=sc.nextInt();

        }
        System.out.println("Correct password ✅");
    }
    public static void breakUses(String word,Scanner sc){
        while(!word.equalsIgnoreCase("exit")){
            System.out.println("enter agin  word");
            word=sc.nextLine();
        }
        System.out.println("correct word");
    }
    public static int positiveSum(){
        int arr[]={1,4,3,-1,-9,1};
        int sum=0;
        for (int j : arr) {
            if (j < 0) {
                continue;
            }
            sum = sum + j;
        }
        return sum;
    }
    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibonacci(n-1) +fibonacci(n-2);

    }
    public static boolean isPalindrome(String str){
        int n=str.length();
        if(n<=1){
            return true;
        }
        if(str.charAt(0)!=str.charAt(n-1)){
            return false;
        }
        //madam
        //ada
        //d
        String newStr=str.substring(1,n-1);
        System.out.println("str: " + newStr);
        return isPalindrome(newStr);
    }


}
