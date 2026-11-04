package org.javaDev;

public class Sorting {
    public static void sortingArr(int arr[],int n){
        for(int i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                if(arr[i]>arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int s: arr){
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        int arr[] ={3,2,4,1,5};
        int n =arr.length;
        sortingArr(arr,n);
    }
}
