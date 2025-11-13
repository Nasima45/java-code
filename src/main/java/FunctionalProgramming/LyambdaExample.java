package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LyambdaExample {
    static void main() {
        List<String> fruits= List.of("apple","mango","kiwi");
        fruits.stream().filter(s->s.endsWith("o")).forEach(System.out::println);
        List< Integer> numbers= Arrays.asList(1,3,2,9,4);
        int summation=numbers.stream().reduce(0, Integer::sum);
        Optional<Integer> maximum_val=numbers.stream().reduce(Integer::max);
        int max=numbers.stream().reduce(Integer.MIN_VALUE,(a,b)->a>b ? a: b);
        System.out.println(max);
        System.out.println(maximum_val);
        System.out.println(summation);
        int mul=numbers.stream().reduce(1,(a,b)->a*b);
        System.out.println(mul);
        fruits.forEach(System.out::println);
        System.out.println("Print only those fruits whose length greater then 4 : ");
        fruits.stream().filter(f->f.length()>4).forEach(System.out::println);
        System.out.println("odd number only : ");
        numbers.stream().filter(f->f%2!=0).forEach(System.out::println);
        fruits.stream().map(String::toUpperCase).forEach(System.out::println);



    }
}
