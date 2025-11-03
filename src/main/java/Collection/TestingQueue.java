package Collection;

import java.util.LinkedList;
import java.util.Queue;

import static Collection.Utility.print;
import static Collection.Utility.printList;

public class TestingQueue {
    static void main() {
        Queue<String > str=new LinkedList<>();
        str.add("kuhu");

        str.offer("naj");
        str.offer("paro");
        printList(str);
        System.out.println("first elem: " + str.peek());
        System.out.printf("%s ",str.element());
        str.remove();
        printList(str);
        //return null if que is empty
        //delete elem
        System.out.println(str.poll());
    }
}

