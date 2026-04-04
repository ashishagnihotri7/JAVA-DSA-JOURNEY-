// Quaction : to number are entered by user x and n write a function to find the value of one number raised to power of another x^n
import java.util.Scanner;

public class day5_power_function {

    // function to calculate x^n
    public static int power(int x, int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * x;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base (x): ");
        int x = sc.nextInt();

        System.out.print("Enter power (n): ");
        int n = sc.nextInt();

        int ans = power(x, n);  // function call

        System.out.println("Result: " + ans);
    }
}

