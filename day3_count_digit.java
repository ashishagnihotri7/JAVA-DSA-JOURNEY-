// Question: count number of digits in a given number
import java.util.Scanner;
public class day3_count_digit {
    public static void main(String[] args) {
        int n = 1234444;
        int count = 0;
        while (n > 0) {
            n = n / 10;
             count++;
            
        }
        System.out.println(count);
    }
}

