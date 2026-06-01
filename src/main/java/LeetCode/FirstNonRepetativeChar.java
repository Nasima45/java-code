package LeetCode;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepetativeChar {
    static void main() {
        String name="nnasima aktar";
        //System.out.println(nonRepeatChar(name));
        nonRepeatChar2(name);
    }
    public static int nonRepeatChar(String name){
        Map<Character,Integer> map= new LinkedHashMap<>();
        for(char ch:name.toCharArray()){
            if(ch!=' '){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
        }
        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            if(ch != ' ' && map.get(name.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
    public static void nonRepeatChar2(String name){
        Map<Character,Integer> map= new LinkedHashMap<>();
        for(char ch:name.toCharArray()){
            if(ch!=' '){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
        }
        System.out.println(map);
        for(char ch: name.toCharArray()){
            if(ch !=' ' && map.get(ch)==1){
                System.out.println(ch);
                return;
            }
        }
    }
}
