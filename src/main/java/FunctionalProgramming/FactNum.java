package FunctionalProgramming;
interface Factorial{
    int fact(int n);
}
public class FactNum {
    static void main() {
        Factorial f=n->{
            int fact =1;
            for(int i=1;i<=n;i++){
                fact= fact*i;
            }
            return fact;
        };
        System.out.println("printing : " + f.fact(5));
    }
}
