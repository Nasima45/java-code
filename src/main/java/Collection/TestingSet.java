package Collection;

import java.util.HashSet;
import java.util.Set;

import static Collection.Utility.printList;

public class TestingSet {
    static void main() {
        Set<String> list=new HashSet<>();
        System.out.println(list.add("kuhu"));
        System.out.println(list.add("kuhu"));
        System.out.println(list.add("nja"));
        System.out.println(list.add("paro"));
        printList(list);
    }
}
