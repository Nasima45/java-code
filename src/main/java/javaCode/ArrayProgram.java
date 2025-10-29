package javaCode;

public class ArrayProgram {
    static void main() {

        int[] arr = {1, 9,3,2};
        int index = 0;
        int n = arr.length;
        boolean result = searching(arr);
        System.out.println(searching(arr));
        while (index < n) {
            System.out.println(arr[index]);
            index++;
        }
        int sumResult = summAndAverage(arr, n);
        System.out.println(sumResult);
        maxMin(arr, n);
        if (isIncreasing(arr, n) || isDecreasing(arr, n)) {
            System.out.println("array is sorted");
        } else {
            System.out.println("not sorted");
        }
        deleteElem(arr, n);
        int reversed[]=reverseArray(arr,n);
        for(int x:reversed){
            System.out.println(x);
        }
        PalindromeArray(arr,n);
        maxMin12(arr,n);
    }
    public static void maxMin12(int arr[], int n) {
        int max = arr[0], min = arr[0];
        int index = 0;
        while (index < n) {
            if (arr[index] > max) max = arr[index];
            if (arr[index] < min) min = arr[index];
            index++;
        }
        System.out.println("Max: " + max + ", Min: " + min);
    }

    public static boolean searching(int[] arr) {

        int n = arr.length;
        int num = 5;
        int index = 0;
        while (index < n) {
            if (num == arr[index]) {
                return true;

            }
            index++;

        }
        return false;
    }

    public static int summAndAverage(int[] arr, int n) {
        int sum = 0;
//        for(int i=0;i<n;i++){
//            sum=sum+arr[i];
//        }
//        return sum/n;
        int index = 0;
        while (index < n) {
            sum = sum + arr[index];
            index++;
        }
        return sum / n;
    }

    public static void maxMin(int arr[], int n) {
        int max = arr[0];
        int min = arr[1];
        int index = 0;
        while (index < n) {
            if (arr[index] > max) {
                max = arr[index];
            }
            if (arr[index] < min) {
                min = arr[index];
            }
            index++;
        }
        System.out.println("max" + max + "," + "min" + min);


    }

    public static boolean isIncreasing(int arr[], int n) {
        int index = 1;
        while (index < n) {
            if (arr[index] < arr[index - 1]) {
                return false;
            }
            index++;
        }
        return true;
    }

    public static boolean isDecreasing(int arr[], int n) {
        int index = 1;
        while (index < n) {
            if (arr[index] > arr[index - 1]) {
                return false;
            }
            index++;
        }
        return true;
    }

    public static void deleteElem(int arr[], int n) {
        int index = 3;
        int newArr[] = new int[n - 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];

        }
        for (int i = index; i < n - 1; i++) {
            newArr[i] = arr[i + 1];
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
    public static int[] reverseArray(int arr[],int n){
        int reversedArr[]=new int [n];
        for(int i=0;i<n;i++){
            reversedArr[i]=arr[n-i-1];
        }
        return reversedArr;
    }
    public static void PalindromeArray(int arr[],int n){
        System.out.println("palindrome check");
        int temp[]=reverseArray(arr,n);
        boolean isPalindrome=false;
        for(int i=0;i<n;i++){
            if (arr[i] == temp[i]) {
                isPalindrome = true;
                break;
            }

        }
        if(isPalindrome){
            System.out.println("yes palindrome");
        }
        else{
            System.out.println("not palindrome");
        }

    }

}
