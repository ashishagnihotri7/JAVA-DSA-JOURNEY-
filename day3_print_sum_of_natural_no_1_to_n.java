    // QUACTION: PRINT THE SUM OF FIRST N NATURAL NUMBER
import java.util.Scanner;
public class day3_print_sum_of_natural_no_1_to_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number  from 0 to n = ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            
        }System.out.println("the sum of natural number is "+ sum );

    }
}
