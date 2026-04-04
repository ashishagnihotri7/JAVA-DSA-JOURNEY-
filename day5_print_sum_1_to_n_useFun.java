import java.util.Scanner;

public class day5_print_sum_1_to_n_useFun {
    public static int addSum(int num) {
       int sum =0;
       for (int i = 0; i <= num; i++) {
           sum = sum + i;

       }
         return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("sum from 1 to n num is "+ addSum(num));
    }
}
