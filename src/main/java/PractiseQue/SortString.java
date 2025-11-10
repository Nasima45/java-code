package PractiseQue;

import java.util.*;

public class SortString {
    static void main() {
        List<String> names = new ArrayList<>(Arrays.asList("kuhu", "naj", "abc"));
        System.out.println(Collections.frequency(names, "kuhu"));
        sorting(names);
        System.out.println(names);
        List<Integer> age = Arrays.asList(3, 5, 2, 6, 1);

        sort(age);
        System.out.println(age);
    }

    public static void sorting(List<String> names) {
        Collections.sort(names);
    }

    public static void sort(List<Integer> names) {
        for (int i = 0; i < names.size(); i++) {
            for (int j = i + 1; j < names.size(); j++) {
                if (names.get(i) > names.get(j)) {
                    int temp = names.get(i);
                    names.set(i, names.get(j));
                    names.set(j, temp);
                }
            }
        }
    }
}
