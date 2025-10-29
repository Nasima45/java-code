package javaCode;

public class forLoopCode {
    static void main() {
        for(int i=1;i<=100;i+=2){
            if(i==97){
                break;
            }
            System.out.print(i+ " ");
        }
        String names[]={"kuhu","naj"};
        String  names2[]=new String[]{"paro","asu"};
        printArr(names2);


    }
    public static void printArr(String  [] arr){
        for(String n: arr){
            System.out.println(n);
        }
    }
}
