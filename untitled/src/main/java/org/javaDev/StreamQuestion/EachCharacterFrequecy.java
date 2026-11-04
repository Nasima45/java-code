package org.javaDev.StreamQuestion;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EachCharacterFrequecy {
    public static void main(String[] args) {
        String input = "programming";
        Map<Character,Long> map = input.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,
                        Collectors.counting()));
        map.entrySet().stream()
                .forEach(entry->System.out.print(entry.getKey()+""+entry.getValue()));
        charFrequency(input);
    }
    public static void charFrequency(String input ){
        System.out.println();
        Map<Character , Integer> map = new LinkedHashMap<>();
        for(char ch:input.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.print(entry.getKey()+""+entry.getValue());
        }
    }
}
