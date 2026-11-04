package org.javaDev;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindDuplicateWithCount {
    public static void main(String[] args) {
        List<String> employee= Arrays.asList("kuhu","naj","paro","kuhu");
        Map<String,Long> duplicateCount =
                employee.stream().collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()
                ));
        System.out.println(duplicateCount);
    }
    public static void findDuplicateWithCount(List<String> emp){
        Map<String,Integer> map = new LinkedHashMap<>();
        for(String str: emp){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+"->"+entry.getValue());
            }
        }
    }
}
