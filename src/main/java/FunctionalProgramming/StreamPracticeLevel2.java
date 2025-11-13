package FunctionalProgramming;

import java.util.List;
import java.util.Optional;

public class StreamPracticeLevel2 {
    static void main() {
        List<Integer> list = List.of(1, 5, 3, 6, 9, 7, 1);
        List<String> words = List.of("kuhu", "naj", "paro");
        List<String> sorted=words.stream().sorted().toList();
        Optional<Integer> sum=list.stream().filter(n->n%2==0).reduce((a, b)->a+b);
    }
}
