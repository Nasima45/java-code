package PractiseQue;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWords {
    static void main() {
        String name= "i am kuhu";
        reverse2(name);

    }
    public static void reverse(String name){
        String words[]=name.trim().split(" ");
        int n=words.length;
        String rev=" ";
        for (int i = n - 1; i >= 0; i--) {
            rev = rev + words[i] + " ";
        }
        System.out.println(rev.trim());
        

    }
    public static void reverse2(String name){
        String words[]=name.split(" ");
        int left=0;
        int right=words.length-1;

        while(left<right){
            String temp=words[left];
            words[left]=words[right];
            words[right] = temp;
            left++;
            right--;
        }
        String afterReverse= Arrays.stream(words).collect(Collectors.joining(" "));
        System.out.println(afterReverse);
    }
}
