package javaCode;

public class ArrayDifferentProgram {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 1};
        int n = arr.length;
        mergeSortedArray();
        if (PalindromeArray2(arr, n)) {
            System.out.println("yes");
        } else {
            System.out.println("not");
        }
        System.out.println("Searching 2: " + searching(arr));

        System.out.println("Original array:");
        for (int x : arr) System.out.print(x + " ");
        System.out.println();

        System.out.println("Average: " + summAndAverage(arr, n));
        maxMin(arr, n);

        if (isIncreasing(arr, n) || isDecreasing(arr, n)) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }

        System.out.println("\nAfter deleting element:");
        deleteElem(arr, n);

        System.out.println("\nReversed array:");
        int[] reversed = reverseArray(arr, n);
        for (int x : reversed) System.out.print(x + " ");
        System.out.println();

        //PalindromeArray(arr, n);
    }

    public static boolean searching(int[] arr) {
        int n = arr.length, num = 2, index = 0;
        int count = 0;
        while (index < n) {
            if (num == arr[index]) {
                count++;

            }
            index++;
        }
        if (count > 0) {
            System.out.println(num + " found " + count + " times");
            return true;
        } else {
            System.out.println("not");
            return false;
        }

    }

    public static int summAndAverage(int[] arr, int n) {
        int sum = 0, index = 0;
        while (index < n) {
            sum += arr[index];
            index++;
        }
        return sum / n;
    }

    public static void maxMin(int arr[], int n) {
        int max = arr[0], min = arr[0];
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
        System.out.println("Max: " + max + ", Min: " + min);
    }

    public static boolean isIncreasing(int arr[], int n) {
        for (int i = 1; i < n; i++) if (arr[i] < arr[i - 1]) return false;
        return true;
    }

    public static boolean isDecreasing(int arr[], int n) {
        for (int i = 1; i < n; i++) if (arr[i] > arr[i - 1]) return false;
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

        for (int x : newArr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static int[] reverseArray(int arr[], int n) {
        int reversedArr[] = new int[n];
        for (int i = 0; i < n; i++) {
            reversedArr[i] = arr[n - i - 1];
        }
        return reversedArr;
//        int index=0;
//        while(index<n){
//            int temp=arr[index];
//            arr[index]=arr[n-1-index];
//            arr[n-1-index]=temp;
//            index++;
//        }

    }

    public static void PalindromeArray(int arr[], int n) {
        System.out.println("\nPalindrome check:");
        int temp[] = reverseArray(arr, n);
        boolean isPalindrome = true;

        for (int i = 0; i < n; i++) {
            if (arr[i] != temp[i]) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) System.out.println("Yes, palindrome");
        else System.out.println("Not palindrome");
    }

    public static boolean PalindromeArray2(int arr[], int n) {
        System.out.println("\nPalindrome check:");
        int index = 0;
        while (index < n / 2) {
            if (arr[index] != arr[n - 1 - index]) {
                return false;
            }

            index++;
        }
        return true;
    }

    public static void mergeSortedArray() {
        int arr1[] = {4, 3, 2, 1};
        int arr2[] = {9, 7, 8, 6};
        int n3 = arr1.length + arr2.length;
        int newArr[] = new int[n3];
        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            newArr[arr1.length+i] = arr2[i];
        }
        System.out.println("Merged Array:");
        for (int i = 0; i < n3; i++) {
            System.out.println(newArr[i]);
        }
    }
}
