package PractiseQue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueChar {
    static void main() {
        Set<Character> uniques= new HashSet<>();
        String name="Nasima";
        for(char c: name.toCharArray()){
            uniques.add(c);
        }
        System.out.println(uniques.size());
        System.out.println(uniques);
        int arr[]={2,1,1,2,1,3,3,6};

        List<Integer> arrList=new ArrayList<>();
        for(int a:arr){
            arrList.add(a);
        }
        Set<Integer> list=new HashSet<>();
        for(int a:arr){
            if(list.add(a)){
                System.out.println(a);
            }
        }

    }
}
