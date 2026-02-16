package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class ParallelStream {

    public static void main(String[] args) {

        // 1️⃣ Create list using Stream
        List<Integer> list = Stream.iterate(1, x -> x + 1)
                .limit(5)
                .toList();

        // 2️⃣ Sum using sequential stream
        int sumValue = list.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of all values: " + sumValue);

        // 3️⃣ Factorial using sequential stream
        System.out.println("Factorial (Sequential Stream):");
        list.stream()
                .map(ParallelStream::factorial)
                .forEach(System.out::println);

        // 4️⃣ Factorial using parallel stream
        List<Integer> parallelResult =
                list.parallelStream()
                        .map(ParallelStream::factorial)
                        .sequential()
                        .toList();

        System.out.println("Factorial (Parallel Stream): " + parallelResult);

        // 5️⃣ 3rd highest salary
        List<Integer> salary = Arrays.asList(1200, 890, 9000, 5600, 1900);

        Integer thirdHighest =
                salary.stream()
                        .distinct()
                        .sorted(Comparator.reverseOrder())
                        .skip(2)
                        .findFirst()
                        .orElse(null);

        System.out.println("3rd highest salary: " + thirdHighest);

        // 6️⃣ Lambda expression
        Calculator calculator = (a, b) -> a + b;
        System.out.println("Addition using lambda: " + calculator.add(8, 9));

        // 7️⃣ Simple loop summation
        int sum = 0;
        for (int i = 2; i <= 5; i++) {
            sum += i;
            System.out.println("Current i: " + i);
        }
        System.out.println("Loop sum: " + sum);

        // 8️⃣ Loop through list
        List<Integer> newList = Arrays.asList(9, 8, 5);
        for (int i = 0; i < newList.size(); i++) {
            System.out.println("Index: " + i + ", Value: " + newList.get(i));
        }

        // 9️⃣ Cumulative sum
        System.out.println("Cumulative sum list: " + summation(newList));
    }

    // Factorial method
    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Cumulative sum method
    public static List<Integer> summation(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        int sum = 0;

        for (int value : list) {
            sum += value;
            result.add(sum);
        }
        return result;
    }
}

// Functional Interface
@FunctionalInterface
interface Calculator {
    int add(int a, int b);
}
