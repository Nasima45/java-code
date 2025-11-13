package FunctionalProgramming;

import java.util.List;
import java.util.Optional;

public class StreamPractice {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 5, 3, 6, 9, 7, 1);
        List<String> names = List.of("kuhu", "naj", "paro");

        // 1️⃣ Even numbers
        List<Integer> even = list.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println("Even numbers: " + even);

        // 2️⃣ Convert all to uppercase
        List<String> upper = names.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println("Uppercase: " + upper);

        // 3️⃣ Find max element
        Optional<Integer> maxElem = list.stream().max(Integer::compareTo);
        maxElem.ifPresent(max -> System.out.println("Max element: " + max));

        // 4️⃣ Count strings starting with 'n'
        long count = names.stream()
                .filter(s -> s.startsWith("n"))
                .count();
        System.out.println("Count of names starting with 'n': " + count);

        // 5️⃣ Remove duplicates
        List<Integer> unique = list.stream()
                .distinct()
                .toList();
        System.out.println("Unique numbers: " + unique);
    }
}
