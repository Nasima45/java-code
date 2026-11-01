package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
class Singletone{
    private static Singletone instance;
    private  Singletone(){

    }
    public static Singletone getInstance(){
        if(instance==null){
            instance=new Singletone();
        }
        return instance;
    }
}
interface Vehicle{
    void start();
}
class car implements Vehicle{
    public void start(){

    }
}
class Factory{
    public static Vehicle getFactor(String type){
        if(type.equalsIgnoreCase("car")){
            return new car();
        }
        throw new IllegalArgumentException("not");
    }
}
public class pr {
    static void main() {
        Singletone obj1=Singletone.getInstance();
        longest();
        merger();
        putzero();
        remove();

    }
    public static void remove(){
        int[] arr = {1,2,0,0,3};
        for(int i=0;i<arr.length;i++){
            boolean isDup=false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    isDup = true;
                    break;
                }
            }
            if(!isDup){
                int count =0;
                for(int k=0;k< arr.length;k++){

                    if(arr[k]==arr[i]){
                        count++;
                    }

                }
                System.out.println(arr[i]+"occure"+count);
            }
        }
    }
    public static void putzero(){
        int[] arr = {1,2,0,0,3};
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[index++]=arr[i];
            }
        }
        while(index<arr.length){
            arr[index++]=0;
        }
        System.out.println(Arrays.toString(arr
        ));
    }
    public static void merger(){
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,5,6};
        int result[]=new int [nums1.length+nums2.length];
        int i=0,j=0,k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                result[k++]=nums1[i++];

            }
            else{
                result[k++]=nums2[j++];
            }
        }
        while(i<nums1.length){
            result[k++]=nums1[i++];
        }
        while(j<nums2.length){
            result[k++]=nums2[j++];
        }
        System.out.println(Arrays.toString(result));
    }
    public static void longest() {
        String s = "abvccddff";
        int left = 0, maxLength = 0, start = 0;
        Set<Character> set = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);
            while (set.contains(current)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(current);
            int currentMax = right - left + 1;
            if (currentMax > maxLength) {
                maxLength = currentMax;
                start = left;
            }
        }
        System.out.println(s.substring(start, start + maxLength));
        System.out.println(maxLength);
    }
}
