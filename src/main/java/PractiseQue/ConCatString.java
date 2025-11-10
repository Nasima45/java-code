package PractiseQue;

import java.awt.color.ICC_ColorSpace;
import java.util.Scanner;

public class ConCatString {
    static void main() {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter num of name which you want add : ");
        int n=sc.nextInt();
        sc.nextLine();
        String[] names=new String[n];
        for(int i=0;i<n;i++){
            names[i]=sc.nextLine();
        }
        System.out.println(concat(names));
        System.out.println(concatination(names));

    }
    public static String  concat(String ...name){
        String addOne="";
        for(int i=0;i<name.length;i++){
            addOne=addOne.concat(name[i]);
        }
        return addOne;
    }
    public static String  concatination(String ...name){
        StringBuilder sb =new StringBuilder();
        for(String str:name){
            sb.append(str);
        }
        return sb.toString();
    }
}
