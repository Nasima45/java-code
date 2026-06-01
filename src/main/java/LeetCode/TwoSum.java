package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    static void main() {
        int arr[] = {8, 7, 6, 5, 9};
        int target = 14;
        twoSumBetter(arr, target);
        //System.out.println(Arrays.toString(twoSum3(arr, target)));

    }

    public static void twoSum(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + "," + arr[j]);
                }
            }
        }
    }

    public static void twoSumBetter(int arr[], int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            //14-8=6
            //14-7=7
            //14-6=8;
            //14-5=9
            //14-9=5
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                //8+6
                System.out.println(complement + "," + arr[i]);
            }
            map.put(arr[i],i);
        }

    }
    public static int[] twoSum3(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        System.out.println(map);
        return new int[]{};
    }

}
