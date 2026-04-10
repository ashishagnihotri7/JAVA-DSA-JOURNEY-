//  QUACTION  Check palindrome string
import java.util.Scanner;
public class day10_palindrome {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("jalaj");
        String rev = "";
        for (int i = sb.length()-1; i >= 0; i--) {
            rev = rev + sb.charAt(i);
        }
        if (sb.toString().equals(rev)) {
        System.out.println("palindrome");
    } else {
        System.out.println("not palindrome");
       }
    }
}