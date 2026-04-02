import java.util.Scanner;
public class day3_reverse_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int n = sc.nextInt();

        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;          // Step 1: last digit nikalo
            reverse = reverse * 10 + digit; // Step 2: reverse banao
            n = n / 10;                 // Step 3: number chhota karo
        }

        System.out.println("Reverse is: " + reverse);
    }
}