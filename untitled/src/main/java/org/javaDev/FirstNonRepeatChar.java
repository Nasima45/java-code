package org.javaDev;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatChar {
    public static void main(String[] args) {
        String name = "Eehana";
        Map<Character,Long> nonRepeatChar = name.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                        ));
        Optional<Character> firstNon = nonRepeatChar.entrySet().stream().filter(entry->entry.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst();
        nonRepeatChar.entrySet().stream().filter(entry->entry.getValue()==1)
                .findFirst()
                .ifPresent(entry-> System.out.println(entry.getKey()+"->"+entry.getValue()));

    }
    public static void firstNonRepeatChar(String name){
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char ch: name.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch: name.toCharArray()){
            if(map.get(ch)==1){
                System.out.println(ch);
                return;
            }
        }
    }
}
