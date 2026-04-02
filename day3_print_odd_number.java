import java.util.Scanner;
public class day3_print_odd_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give any number to print odd number");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                System.out.println("odd number is " +i);
            }
        }
    }
}
   
