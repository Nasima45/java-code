package org.javaDev;

public class ReverseString {
    public static void main(String[] args) {
        String name = "naziya";
        char rev[] = name .toCharArray();
        int start=0;
        int end =rev.length-1;
        while(start<end){
            char temp =rev[start];
            rev[start]= rev[end];
            rev[end] = temp;
            start++;
            end--;
        }
        System.out.println(rev);
    }
}
