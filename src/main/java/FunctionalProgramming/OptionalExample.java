package FunctionalProgramming;

import java.util.*;
import java.util.stream.Collectors;

public class OptionalExample {
    public static void main(String[] args) {
        // Empty list example
        List<String> fruits = List.of();

        // Sample words
        List<String> words = Arrays.asList("stream", "arr", "max");

        // Convert stream back to list
        List<String> list = words.stream()
                .collect(Collectors.toList());

        // Convert all words to upper case
        List<String> upperCase = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // Convert all words to lower case
        List<String> lowerCase = words.stream()
                .map(s -> s.toLowerCase())
                .collect(Collectors.toList());

        // Sort numbers
        List<Integer> numbers = Arrays.asList(1, 4, 2, 5, 2, 9);
        List<Integer> unique=numbers.stream().distinct().toList();
        System.out.println(unique);
        List<Integer> sorted = numbers.stream()
                .sorted()
                .toList();
        System.out.println("Sorted: " + sorted);

        // Find maximum using Optional
        Optional<Integer> maxElem = numbers.stream()
                .max(Integer::compareTo);
        System.out.println("Max element (Optional): " + maxElem);

        // Safely print max element
        maxElem.ifPresent(max -> System.out.println("Max value: " + max));

        // Print transformations
        System.out.println("Lower case: " + lowerCase);
        System.out.println("Upper case: " + upperCase);
        System.out.println("Converted Stream to List: " + list);

        // Handle empty Optional
        Optional<String> result = fruits.stream().findFirst();
        if (result.isPresent()) {
            System.out.println(result.get());
        } else {
            System.out.println("Empty list — no elements found!");
        }
    }
}
