// Quaction : write a program to enter the number till the user wants and the end it should print count of positive ,negative ,and zero 
import java.util.Scanner;

public class day5_till_user_want {

    // Function to process number and update counts
    public static void checkNumber(int num, int[] count) {
        if (num > 0) {
            count[0]++;   // positive
        } else if (num < 0) {
            count[1]++;   // negative
        } else {
            count[2]++;   // zero
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] count = new int[3]; // [0]=positive, [1]=negative, [2]=zero
        char choice;

        do {
            System.out.print("Enter number: ");
            int num = sc.nextInt();

            // function call
            checkNumber(num, count);

            System.out.print("Do you want to continue? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Positive count: " + count[0]);
        System.out.println("Negative count: " + count[1]);
        System.out.println("Zero count: " + count[2]);
    }
}