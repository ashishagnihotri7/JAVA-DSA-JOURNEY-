// QUACTION : Count occurrences
import java.util.Scanner;

public class day8Count_occurrences {
    public static void main(String[] args) {
        int count =0;
        int target = 6;
        int a[] = { 1, 2, 3, 4, 5, 5, 5, 6, 6, 3, 24, };
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                count++;
            }
        }
        System.out.println("occure = " + count );
    }
}
