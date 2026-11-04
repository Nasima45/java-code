package org.javaDev.StreamQuestion;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatCharStream {
    public static void main(String[] args) {
        String name = "Rehana";
        Map<Character,Long> nonRepeatChar = name.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,Collectors.counting()));
        nonRepeatChar.entrySet().stream()
                .filter(entry->entry.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
