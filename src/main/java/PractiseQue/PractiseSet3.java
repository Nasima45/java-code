package PractiseQue;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PractiseSet3 {
    static void main() {
        String name = "nasima aktar";
        countCharacter(name);
        //removeDuplicate();
        firstNonRepetativeChar(name);
    }
public static void firstNonRepetativeChar(String name){
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:name.toCharArray()){
            if(ch !=' ') {
                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch)+1);
                } else {
                    map.put(ch, 1);
                }
            }
        }
    System.out.println("count of each character: " + map);
        for(Map.Entry<Character,Integer> e:map.entrySet()){
            if(e.getValue()==1){
                System.out.println(e.getKey());
                break;
            }
        }
}
    public static void countCharacter(String name) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : name.toCharArray()) {
            if (ch != ' ') {
                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                } else {
                    map.put(ch, 1);
                }
            }
        }
        System.out.println("count of each character: " + map);
    }
    public static void removeDuplicate() {
        int arr[]={5,3,2,3,4,2};
        for(int i=0;i<arr.length;i++){
            boolean isDup=false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    isDup=true;
                }
            }
            if(!isDup){
                int count =0;
                for(int k=0;k<arr.length;k++){
                    if(arr[k]==arr[i]){
                        count++;
                    }
                }
                System.out.println(arr[i]+": "+count);
            }
        }
    }

}
