//count highest frequency of int 

import java.util.HashMap;

public class day42_counthighfreq {
    public static void main(String[] args) {
        int arr[] = { 1,  2, 3, 3, 3, 2, 4,4,4,4, };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

        }
        int max = 0;
        int ans = -1;
        for (Integer key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                ans = key;
            }
        }
        System.out.println(ans+" -> "+max);

    }
}
