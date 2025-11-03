package Collection;

public class VarArguments {

    // ... cslled ellipsis
    static void main() {
        System.out.println(sum(5,3,4));
    }
    public static int sum(int first,int ...a){
        int sum=first;
        for(int i:a){
            sum=sum+i;
        }
        return sum;
    }
}
