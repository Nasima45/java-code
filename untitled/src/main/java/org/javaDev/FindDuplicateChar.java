package org.javaDev;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateChar {
    public static void main(String[] args) {
        String name = "naziya";
        Map<Character,Long> duplicateChar =name.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity()
                        ,LinkedHashMap::new,Collectors.counting()));
        //System.out.println(duplicateChar);
        duplicateChar.entrySet().stream()
                .filter(entry->entry.getValue()>1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
        duplicateChar.entrySet().stream()
                .filter(entry->entry.getValue()>1)
                .forEach(entry->
                        System.out.println(entry.getKey()+"->"+entry.getValue()));
    }
    public static void findDuplicateChar(String name){
        Map<Character,Integer> map =new LinkedHashMap<>();
        for(char ch : name.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }
    }
}
