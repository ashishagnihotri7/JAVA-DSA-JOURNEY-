// QUACTION : PRINT THE FACTORS OF THE NUMBER
import java.util.*;

public class day34_striver_maths5 {
    public static void main(String[] args) {
        int num = 36;
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                list.add(i);
                if (i != num / i) {
                    list.add(num / i);
                }
            }
        }
        Collections.sort(list);
        for (int i : list) {
            System.out.println(i);

        }
    }
}
    