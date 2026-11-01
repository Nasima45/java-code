package LeetCode;

import java.util.*;

public class RemoveDuplicate {
    static void main() {
        int arr[]={3,2,1,2,3,5,6,7};
        removeDuplicateArray(arr);
//        String name="nasima aktar";
//        Set<Character> set =new HashSet<>();
//        for(char c:name.toCharArray() ){
//            if(c!=' '){
//            set.add(c);}
//        }
//        System.out.println("un" + set);
//        removeDuplicate(arr);
//        removeDuplicateString(name);
    }
    public static void removeDuplicateArray(int arr[]){
        List<Integer> list =new ArrayList<>();
        for(int i:arr){
            if(!list.contains(i)){
                list.add(i);
            }
        }
        System.out.println(list);
    }
    public static void removeDuplicate(int arr[]){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i)==1){
                System.out.println(i);
            }
        }
    }

    public static void removeDuplicateString(String name){
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:name.toCharArray()){
            if(ch!=' '){
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.get(ch)==1){
                System.out.println(ch);
            }}
        }


    }
}
