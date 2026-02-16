package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamEntering {
    static void main() {
        List<Integer> numbers= Arrays.asList(2,4,1,6,9,3);
        Long count=numbers.stream().filter(x->x%2==0).count();
        System.out.println(count);
        String array[]={"nj","ki","paro"};
        Stream.of(array);
        Stream<String> streamConveryt=Arrays.stream(array);
        List<String> students=Arrays.asList("paro","naj","kj","aditi","aheli");
        List<String> startsWithA=students.stream().filter(name->name.startsWith("a")).toList();
        System.out.println(startsWithA);
        startsWithA.stream().map(String::toUpperCase).forEach(System.out::println);
        System.out.println("My sorted list: ");
        students.stream().distinct().sorted((a,b)->a.length()-b.length()).forEach(System.out::println);
    }
}
