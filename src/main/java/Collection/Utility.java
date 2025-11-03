package Collection;

import java.util.Collection;

public class Utility {
    public static void print(Collection collection){
        for(Object obj:collection){
            System.out.println(obj);
        }
    }

    //generics
    public static <E> void printList(Collection<E> collection){
        System.out.println("Collection is : ");
        for(E obj:collection){
            System.out.println(obj);
        }
    }
}
