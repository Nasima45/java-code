package LeetCode;

import java.util.Arrays;

public class MergerSortedArray {
    static void main() {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,5,6};
        merge(nums1,nums2);
    }
    public static void merge(int nums1[],int nums2[]){
        int result[]=new int[nums1.length+nums2.length];
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
        while(j< nums2.length){
            result[k++]=nums2[j++];
        }
        System.out.println(Arrays.toString(result));
    }
}
