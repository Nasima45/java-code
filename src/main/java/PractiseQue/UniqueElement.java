package PractiseQue;

import java.util.ArrayList;
import java.util.List;

public class UniqueElement {
    static void main() {
        int[] arr = {3, 2, 1, 3, 4, 2, 5, 6, 5};
        String name = "nasima aktar";
        removeDuplicateChar(name);

        // Method 1: Find unique elements and their counts
        unique(arr);

        // Method 2: Print unique elements manually without using a List or Set
        removeDuplicate(arr);
    }

    //  Method 1: Finds how many times each unique element appears
    static void unique(int[] arr) {
        int n = arr.length;
        List<Integer> un = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            // If element not already checked, process it
            if (!un.contains(arr[i])) {
                un.add(arr[i]); // Add to unique list so we don’t count it again

                int count = 0;
                // Count how many times this element appears in the whole array
                for (int j = 0; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                System.out.println("Count of " + arr[i] + " is " + count);
            }
        }

        System.out.print("Unique elements: ");
        System.out.println(un);
    }

    // Method 2: Removes duplicates and prints only unique elements
    static void removeDuplicateWithCount(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            // Inner loop checks all previous elements
            // For example, when i = 2 → j will check indices 0 and 1

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true; // Found a duplicate

                    break; // Stop checking further
                }
            }

            // If no duplicate found, print the element
            if (!isDuplicate) {
                int count = 1;
                for (int k = i + 1; k < n; k++) {
                    if (arr[i] == arr[k]) {
                        count++;
                    }
                }
                System.out.println("Count of " + arr[i] + " is " + count);

            }
        }

    }

    static void removeDuplicate(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            // Inner loop checks all previous elements
            // For example, when i = 2 → j will check indices 0 and 1

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true; // Found a duplicate

                    break; // Stop checking further
                }
            }

            // If no duplicate found, print the element
            if (!isDuplicate) {
                System.out.println(arr[i]);

            }
        }
    }

    static void removeDuplicateChar(String name) {
        char words[] = name.toCharArray();
        int n = words.length;
        for (int i = 0; i < n; i++) {
            boolean isDup = false;
            for (int j = 0; j < i; j++) {
                if (words[i] == words[j]) {
                    isDup = true;
                    break;
                }
            }
            if (!isDup) {
                System.out.println(words[i]);
            }
        }
    }
}
