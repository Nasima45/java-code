package PractiseQue;

import java.util.HashSet;
import java.util.Set;

public class UniqueChar {
    static void main() {
        Set<Character> uniques= new HashSet<>();
        String name="Nasima";
        for(char c: name.toCharArray()){
            uniques.add(c);
        }
        System.out.println(uniques.size());

    }
}
