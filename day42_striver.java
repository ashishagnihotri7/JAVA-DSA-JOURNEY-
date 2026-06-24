//quaction count frequency 
import java.util.HashMap;

public class day42_striver {

    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        String a = "aasshish";
        for (int i = 0; i < a.length(); i++) {
            map.put(a.charAt(i), map.getOrDefault(a.charAt(i), 0) + 1);
        

        }
        for(Character key : map.keySet()){
            System.out.println(key + " -> " + map.get(key));
        }
    }
}