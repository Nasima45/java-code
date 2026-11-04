package org.javaDev;

public class ReverseArray {
    public static void reverseArray(int arr[], int n) {
        int start = 0;
        int end = n - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (int s : arr) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 1, 5};
        int n = arr.length;
        reverseArray(arr, n);
    }
}
