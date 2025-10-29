package javaCode;

public class BitwiseOperator {
    //oddeven
    static void main() {
        int num =5;
        if((num & 1)==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
