package PractiseQue;

import java.util.Arrays;
import java.util.List;

public class ReverseArrayTest {
    static void main() {
        List<Integer> list= Arrays.asList(2,1,3,4,5);
        rev(list);
        System.out.println(list);
        int arr[]={9,8,7,6};

        String str[]={"par","abc","cad"};
        revStr4(str);
//        rev1(arr);
//        revStr(str);
        System.out.println("different ways");


    }
    public static void rev(List<Integer> list){
        int n=list.size();
        for(int i=0;i<list.size()/2;i++){
            int temp=list.get(i);
            list.set(i,list.get(n-i-1));
            list.set(n-i-1,temp);
        }
    }

    public static void rev1(int[] list){

       int n=list.length;
       for(int i=0;i<n/2;i++){
           int temp=list[i];
           list[i]=list[n-i-1];
           list[n-i-1]=temp;

       }
       for(int l:list){
           System.out.println(l);
       }

    }
    public static void revStr(String[] list){

        int n=list.length;

        for(int i=0;i<n/2;i++){
            String temp=list[i];
            list[i]=list[n-i-1];
            list[n-i-1]=temp;

        }
        for(String l:list){
            System.out.println(l);
        }

    }
    public static void revStr4(String[] list){

        int n=list.length;
        String [] newStr=new String[n];

        for(int i=0;i<n;i++){
            newStr[i]=list[n-i-1];
        }
        for(String l:newStr){
            System.out.println(l);
        }

    }


}
