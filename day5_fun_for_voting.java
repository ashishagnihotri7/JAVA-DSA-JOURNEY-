// Quaction:take age from user if greater then 18 print eligible
import java.util.Scanner;

public class day5_fun_for_voting {
    public static boolean votingAge(int age) {
        if (age > 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (votingAge(age)) {
            System.out.println("eligible");
        }
        else {
        System.out.println("not eligible");
       }
    }
}
