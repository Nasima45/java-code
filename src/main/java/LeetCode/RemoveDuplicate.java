package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicate {
    static void main() {
        int arr[]={3,2,1,2,3,5,6,7};
        String name="nasima aktar";
        removeDuplicate(arr);
        removeDuplicateString(name);
    }
    public static void removeDuplicate(int arr[]){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i)==1){
                System.out.println(i);
            }
        }
        //System.out.println(map);

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
        //System.out.println(map);

    }
}
