package org.javaDev;

public class MergerSortedArray {
    public static void main(String[] args) {
        int arr1[] = {2, 3, 4};
        int arr2[] = {6, 7, 8};
        int newArr[] = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                newArr[k++] = arr1[i++];
            } else {
                newArr[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            newArr[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            newArr[k++] = arr2[j++];
        }
        for (int num : newArr) {
            System.out.println(num);
        }
    }
}
