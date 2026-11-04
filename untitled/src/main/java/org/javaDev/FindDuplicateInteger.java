package org.javaDev;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateInteger {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,2,4,1,5,7,5,2,5,3);
        Map<Integer,Long> duplicateInteger = list.stream()
                .collect(Collectors.groupingBy(Function.identity()
                        ,LinkedHashMap::new,
                Collectors.counting()
        ));

     duplicateInteger.entrySet()
                        .stream().filter(entry->entry.getValue()>1)
                        .map(Map.Entry::getKey)
                        .forEach(entry-> System.out.println(entry));
        duplicateInteger.entrySet()
                .stream().filter(entry->entry.getValue()>1)
                .forEach(entry-> System.out.println(entry.getKey()+"->"+entry.getValue()));
    }
    public static void findDuplicateIntegers(List<Integer> arr){
        Map<Integer,Integer> map =new LinkedHashMap<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
            }
        }
    }
}
