package org.javaDev;

public class LargestElement {
    public static void main(String[] args) {
        int arr[]={3,2,4,1,5,7,5,2};
        largestElemtn(arr);
    }
    public static void largestElemtn(int arr[]){
        int max =arr[0];
        int secMax = arr[0];
        for(int i =1;i<arr.length;i++){
            if(arr[i]>max){
                secMax= max;
                max= arr[i];
            }
            else if(secMax<arr[i] && arr[i]!=max){
                secMax =arr[i];
            }
        }
        System.out.println(max);
        System.out.println(secMax);
    }
}
