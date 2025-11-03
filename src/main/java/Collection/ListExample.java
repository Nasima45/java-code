package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static Collection.Utility.printList;

public class ListExample {
    static void main() {
        List<Integer> list=new ArrayList<>();
        list.add(7);
        list.add(8);
        list.add(5);
        System.out.println(list);
        int findOut=8;
        if(list.contains(findOut)){
            System.out.println("yes exist at "  +list.indexOf(findOut));
        }else{
            System.out.println("not present");
        }

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        printList(list);
        Collections.sort(list);
        printList(list);
        Collections.reverse(list);
        printList(list);

        List<Integer> unmodifiable=Collections.unmodifiableList(list);
        //it will throw exception
        unmodifiable.add(4);




    }
}
