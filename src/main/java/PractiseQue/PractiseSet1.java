package PractiseQue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PractiseSet1 {
    static int a=10;
    static void main() {
        System.out.println(a);
        a++;
        System.out.println(a);
        int arr[] = {3, 2, 2,9, 1};
        int n = arr.length;
        System.out.println(search(arr,5));
        int elem=2;
        boolean result= Arrays.stream(arr).anyMatch(i->i==elem);
        System.out.println(result);
        largeAndSecLarge(arr);
        addNewElem(arr);
//        sorting(arr,n);
//        System.out.println(" We did sorting here: ");
//        printing(arr);
//        reverse(arr,n);
//        System.out.println("Reversed the array here : ");
//        printing(arr);
//        System.out.println("after removing dupliates: ");
//        removeDuplicate(arr,n);
        removeDuplicateUsingList(arr);
        duplicateStringCount();
    }

    public static void sorting(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void reverse(int arr[], int n) {
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }

    public static void removeDuplicate(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            boolean isDup = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDup = true;
                    break;
                }
            }
            if (!isDup) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void removeDuplicateUsingList(int arr[]) {
        List<Integer> unique = new ArrayList<>();
        for (int elem : arr) {
            if (!unique.contains(elem)) {
                unique.add(elem);
                int count = 0;
                for (int j : arr) {
                    if (elem == j) {
                        count++;
                    }
                }
                System.out.println("count of " + elem + "is" + count);
            }
        }
        System.out.println("unique list : " + unique);
    }

    public static void printing(int arr[]) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    //Input: aaabbbacfwww
    //Output: a3b3acfw3
    public static void duplicateStringCount(){
        String input = "aaabbbacfwww";
        char []single=input.toCharArray();
        int n= single.length;
        for(int i=0;i<n;i++){
            boolean isDup=false;
            for(int j=0;j<i;j++){
                if(single[i]==single[j]){
                    isDup=true;
                    break;
                }
            }
            if(!isDup){
                System.out.println(single[i]);
            }
        }
    }

    public static boolean search(int arr[], int elem) {
        for (int i : arr) {
            if (i == elem) {
                return true;
            }
        }
        return false;
    }
    public static void largeAndSecLarge(int arr[]){
        if(arr.length<2){
            throw new IllegalArgumentException("size is just 2");
        }
        int max=arr[0];
        int secLarge=arr[1];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                secLarge=max;
                max=arr[i];
            }
            else if(arr[i]>secLarge && arr[i]!=max){
                secLarge=arr[i];
            }
        }
        System.out.println("max: " + max);
        System.out.println("sec max : " + secLarge);
    }

    public static void addNewElem(int arr[]) {
        int newArr[] = new int[arr.length + 1];
        int newElem = 8;
        int position = 2;
        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }
        newArr[position] = newElem;
        for (int i = position; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        for(int i :newArr){
            System.out.println(i);
        }

    }
}
