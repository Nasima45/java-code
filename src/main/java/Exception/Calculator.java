package Exception;

public class Calculator {
    public static int add(){
        int a=0;
        int b=0;
//        if(b==0){
//            return 0;
//        }
        try{
            a=9/b;
        }
        catch(ArithmeticException e){
            System.out.printf("%s",e.getMessage());
        }
        return a;
    }

    static void main() {
        int result=add();
        System.out.println(result);
    }
    }

