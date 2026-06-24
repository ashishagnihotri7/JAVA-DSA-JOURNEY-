//quaction count frequency 

import java.util.*;
public class day42_dsa_hash {

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = { 1, 2, 3, 3, 4, 2, 3, };
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], arr[i] + 1);
            }
            else {
                map.put(arr[i], 1);
            }
        }
        for (Integer key : map.keySet()) {
            System.out.println(key + "->" + map.get(key));
        }
        
    }
}