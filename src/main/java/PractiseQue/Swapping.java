package PractiseQue;

import java.util.Arrays;
import java.util.List;

public class Swapping {
    static void main() {
        List<Integer> list = Arrays.asList(1, 2, 4, 5);
        System.out.println(list);
        swap(list, 2, 3);
        System.out.println(list);

    }

    public static void swap(List<Integer> list, int x, int y) {
        int temp = list.get(x);
        list.set(x, list.get(y));
        list.set(y, temp);

    }
}
