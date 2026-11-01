package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LonestChar {
    static void main() {
        String s="wgdkbjkkkk";
        longCharUsingSet(s);
    }

    public static void longCharUsingSet(String s){
        int left =0,maxLength=0,start = 0;
        Set<Character> set =new HashSet<>();
        for(int right=0;right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));

            int currentLength= right-left+1;
            //maxLength=Math.max(maxLength,currentLength);
            if(currentLength>maxLength){
                maxLength=currentLength;
                start=left;
            }
        }
        System.out.println(s.substring(start,start+maxLength));
        System.out.println(maxLength);
    }
    public static int check(String s) {
        Map<Character, Integer> map = new HashMap<>();

        // Left pointer of the sliding window
        int left = 0;

        // Stores the maximum length of substring without repeating characters
        int maxLength = 0;

        // Right pointer expands the sliding window
        for (int right = 0; right < s.length(); right++) {

            // Current character at the right pointer
            char current = s.charAt(right);

            // If current character is already present,
            // move the left pointer to avoid duplicates.
            //
            // Example: s = "abcabcbb"
            //
            // right = 3, current = 'a'
            // map = {a=1, b=2, c=3}
            // left = max(0, 1) = 1
            //
            // Window changes from "abca" to "bca"
            //
            // Example: s = "abba"
            // right = 2, current = 'b'
            // map = {a=1, b=2}
            // left = max(0, 2) = 2
            //
            // Window changes from "abb" to "b"
            //
            // Math.max() ensures left never moves backward.
            if (map.containsKey(current)) {
                left = Math.max(left, map.get(current));
            }

            // Store current character's next position (right + 1)
            //
            // Example:
            // right = 2 ('c')
            // Store c -> 3
            //
            // We store right + 1 so that next time we can directly write:
            // left = map.get(current)
            // instead of
            // left = map.get(current) + 1
            map.put(current, right + 1);

            // Current window length = right - left + 1
            //
            // Example:
            // left = 1, right = 3
            // Window = "bca"
            // Length = 3
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0 || s == null) {
            return 0;
        }
        Map<Character, Integer> map = new HashMap<>();
        //starting point
        int left = 0;
        int maxLength = 0;
        //right expand the window
        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);
            if (map.containsKey(current)) {
                left = Math.max(left, map.get(current));
            }

            map.put(current, right + 1);
            //0,0-0+1
            //0,1
            //maxLength=1
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;

    }



}
