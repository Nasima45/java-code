package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOp {
    public static final Logger logger=Logger.getLogger(TerminalOp.class.getName());
    public static void main(String[] args) {

        // 1️⃣ Basic list
        List<Integer> list = Arrays.asList(1, 4, 2, 5, 6);

        // 2️⃣ skip + collect
        List<Integer> filtered =
                list.stream()
                        .skip(1)
                        .collect(Collectors.toList());
        System.out.println("After skip: " + filtered);

        // 3️⃣ reduce (sum)
        Optional<Integer> sumOptional =
                list.stream().reduce(Integer::sum);

        logger.info("Sum using reduce: " + sumOptional.orElse(0));

        // 4️⃣ anyMatch
        boolean hasEven =
                list.stream().anyMatch(x -> x % 2 == 0);
        System.out.println("Any even present: " + hasEven);

        // 5️⃣ findFirst & findAny
        System.out.println("First element: " +
                list.stream().findFirst().orElse(null));

        System.out.println("Any element: " +
                list.stream().findAny().orElse(null));

        // 6️⃣ Filter strings
        List<String> students =
                Arrays.asList("paro", "naj", "kj", "aditi", "aheli");

        students.stream()
                .filter(name -> name.length() > 3)
                .forEach(System.out::println);

        // 7️⃣ Map + sorted (ascending)
        list.stream()
                .map(x -> x * x)
                .sorted()
                .forEach(System.out::println);

        // 8️⃣ Map + sorted (descending)
        list.stream()
                .map(x -> x * x)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        // 9️⃣ Reduce again (sum)
        System.out.println("Sum again: " +
                list.stream().reduce((a,b)->a+b).orElse(0));

        // 🔟 Count specific character
        String sentence = "hello world";
        System.out.println("Count of 'l': " +
                sentence.chars().filter(x -> x == 'l').count());

        // 1️⃣1️⃣ Length of each string
        System.out.println("Student name lengths: " +
                students.stream().map(String::length).toList());

        // 1️⃣2️⃣ Lazy evaluation demo
        Stream<String> stream =
                students.stream().filter(name -> {
                    System.out.println("Filtering: " + name);
                    return name.length() > 3;
                });

        List<String> result = stream.collect(Collectors.toList());
        System.out.println("Filtered students: " + result);
        System.out.println("max" + Stream.of(2,6,5,7).max(Comparator.naturalOrder()));
        System.out.println("maxNormal" + Stream.of(2,6,5,7).max((n,n2)->n-n2));
        System.out.println("minNormal" + Stream.of(2,6,5,7).min((n,n2)->n-n2));
        System.out.println("min" + Stream.of(2,6,5,7).max(Comparator.reverseOrder()));

        List<List<String>> doubleList=Arrays.asList(
                Arrays.asList("paro", "naj"),
                Arrays.asList("nasu", "ami")
        );
        System.out.println(doubleList.get(0).get(1));
        List<String> singleList=doubleList.stream().flatMap(m->m.stream()).map(String::toUpperCase).toList();
        System.out.println(singleList);
        List<String> flatMapUses=Arrays.asList(
                "i am ", "kuhu", "using stream"
        );
        List<String> convertedList =
                flatMapUses.stream()
                        .flatMap(word -> Arrays.stream(word.split(" ")))
                        .toList();

        logger.info("This is the converted: " + convertedList);
        String sentemnce=" Nasima Aktar";
        Long count=sentemnce.chars().filter(x->x== 'a').count();
        System.out.println(count);

    }
}
