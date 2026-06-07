// QUACTION CHECK IT IS PALINDROME OR NOT 
import java.util.*;
public class day34_striver_maths3 {
    public static void main(String[] args) {

        int num = 7723277;
        int realnum = num;
        int reverse = 0;
        while (num > 0) {
            int las = num % 10;
            num = num / 10;
            reverse = (reverse * 10) + las;

        }
        if (realnum == reverse) {
            System.out.println("the number is palindrome");
        }
        else {
            System.out.println("the number is not palindrome");
        }
    }
    }

