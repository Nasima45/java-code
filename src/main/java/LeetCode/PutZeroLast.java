package LeetCode;

import java.util.Arrays;

public class PutZeroLast {
    static void main() {
        int[] nums = {1,2,0,0,3};
        putZeroInLast(nums);
    }
    public static void putZeroInLast(int nums[]){
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index++] =nums[i];
            }
        }
        while(index<nums.length){
            nums[index++]=0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
