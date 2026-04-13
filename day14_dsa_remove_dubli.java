// QUACTION to solve the duplicate by brute force solution by two ppointer

import java.util.*;

public class day14_dsa_remove_dubli {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 33, 3, 3, 4, 5};

        Set<Integer> st = new LinkedHashSet<>(); // duplicates remove + order same

        // Step 1: set me daalo
        for (int i = 0; i < arr.length; i++) {
            st.add(arr[i]);
        }

        // Step 2: wapas array me daalo
        int index = 0;
        for (int num : st) {
            arr[index] = num;
            index++;
        }

        // Print result
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}