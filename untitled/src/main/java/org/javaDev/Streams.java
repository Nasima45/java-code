package org.javaDev;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<String> employee = Arrays.asList("kuhu", "naj", "paro", "kuhu");
        List<Integer> salary = Arrays.asList(30000, 50000, 70000, 40000, 70000, 60000);
        Optional<Integer> secHigh = salary.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(secHigh);
        //String Occurrence with count
        Map<String, Long> OccurrenceOfEachString = employee.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(OccurrenceOfEachString);
        OccurrenceOfEachString.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey() + "->" + entry.getValue()));
        //First String Occurrence
        Map<String, Long> findStringOccurence = employee.stream().collect(
                Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        Optional<String> first = findStringOccurence.entrySet().stream().filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();
        System.out.println(first);
        String name ="nnaziya";
        Map<Character,Long> charCount= name.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,Collectors.counting()));
        Optional<Character> firstNonRepeatChar =  charCount.entrySet().stream().filter(entry->entry.getValue()==1)
                .map(Map.Entry::getKey)
        .findFirst();
        System.out.println(firstNonRepeatChar);
    }
}
