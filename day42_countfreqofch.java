// count frequence of string 

import java.util.HashMap;

public class day42_countfreqofch {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        String str = "ashishh";
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        int max = 0;
        char ans = 0;
        for (Character key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                ans = key;
            }
        }
        System.out.println(ans + " -> "+ max);
    }
}
