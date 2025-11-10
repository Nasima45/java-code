package PractiseQue;

import java.util.*;

public class RemoveDuplicate {
    static void main() {
        Set<String> name = new HashSet<>(Arrays.asList("kuhu", "naj", "paro", "kuhu", "paro"));
        System.out.println("unique people's : ");
        for (String n : name) {
            System.out.println(n);
        }
        List<String> arr = new ArrayList<>(Arrays.asList("kuhu", "naj", "paro", "kuhu", "paro"));
        List<String> unique = new ArrayList<>();
        for (String names : arr) {
            if (!unique.contains((names))) {
                unique.add(names);
            }
        }
        System.out.println(unique);
    }
}
