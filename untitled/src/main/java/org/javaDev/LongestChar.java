package org.javaDev;

import java.util.HashSet;
import java.util.Set;

public class LongestChar {
    public static void main(String[] args) {
        longi();
    }

    public static void longi() {
        String name = "abcabcbb";
        int left = 0, maxLength = 0, start = 0;
        Set<Character> set = new HashSet<>();
        for (int right = 0; right < name.length(); right++) {
            char cuurent = name.charAt(right);
            while (set.contains(cuurent)) {
                set.remove(name.charAt(left));
                left++;
            }
            set.add(cuurent);
            int currentLength = right - left + 1;
            if (currentLength > maxLength) {
                maxLength = currentLength;
                start = left;
            }
        }
        System.out.println(name.substring(start, start + maxLength));
    }
}
