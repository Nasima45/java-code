package Stream;

import java.util.*;

public class StreamPractiseSet {
    public static void main(String[] args){
        List<String> stringList=List.of("kuhu","naj","paro","nasima");
        List<Integer> integerList= Arrays.asList(22,36,51,36,22);
        Optional<Integer> sum=integerList.stream().reduce((a, b)->a+b);
        System.out.println(sum);
        OptionalInt max=integerList.stream().mapToInt(Integer::intValue).max();
        HashSet<Integer> set=new HashSet<>();
        //List<Integer> duplicateList = integerList.stream().filter(e -> !set.add(e)).toList();
        //System.out.println(duplicateList);
        integerList.stream().filter(e->set.add(e)).forEach(System.out::println);
    }
}
