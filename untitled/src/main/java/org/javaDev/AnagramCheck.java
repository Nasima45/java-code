package org.javaDev;

import java.util.*;

public class AnagramCheck {
    public static void main(String[] args) {
        System.out.println(isAnagram());
        arrayOfAnagram();
    }
    public static boolean isAnagram(){
        String first ="abcd";
        String sec ="bcan" +
                "";
        if(first.length()!=sec.length()){
            return false;
        }
        char firstArr[]=first.toCharArray();
        char secArr[]=sec.toCharArray();
        Arrays.sort(firstArr);
        Arrays.sort(secArr);
        return Arrays.equals(firstArr,secArr);
    }
    public static void arrayOfAnagram(){
        String[] arr= {"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String, List<String>> map = new HashMap<>();
        for(String value : arr){
            char [] chars = value.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if(map.containsKey(key)){
                map.get(key).add(value);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(value);
                map.put(key,list);
            }

        }
        System.out.println(map.keySet());
        System.out.println(map.values());
//        for(Map.Entry<String,List<String>> entry: map.entrySet()){
//            System.out.println(entry.getKey()+"->"+entry.getValue());
//        }
    }
}
