package Stream;

import java.util.Arrays;
import java.util.List;

public class MethodRefferenceExample {
    static void main() {
        List<String> list= Arrays.asList("kuhu","naj","paro");
        list.forEach(s-> System.out.println(s));
        System.out.println("using method refference");
        list.forEach(System.out::println);

    }
}
