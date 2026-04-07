import java.util.Scanner;

public class day8_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int size = sc.nextInt();
        sc.nextLine(); // clear buffer

        String arr[] = new String[size];

        System.out.println("Enter strings:");

        // input
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextLine();
        }

        int sum = 0;

        // calculation
        for (int i = 0; i < size; i++) {
            sum = sum + arr[i].length();
        }

        System.out.println("Total length: " + sum);

        sc.close();
    }
}