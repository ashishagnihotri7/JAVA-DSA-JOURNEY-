 // QUACTION REVERSE THE NUMBER AND REMOVE THE LEADING ZERO IN THE REVERSED NUMBER 
import java.util.*;

public class day34_striver_math2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int reverse = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            num = num / 10;
            reverse = (reverse * 10) + lastDigit;
        }
        System.out.println("Reversed Number is: " + reverse);
    }
}














