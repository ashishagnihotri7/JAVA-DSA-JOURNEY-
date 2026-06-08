import java.util.*;

public class day35_striver_maths6 {
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 10;
        while (num1 > 0 && num2 > 0) {
            if (num1 > num2) {
                num1 = num1 % num2;
            } else {
                num2 = num2 % num1;
            }

        }
        if (num1 == 0) {
            System.out.println(num2);
        } else {
            System.out.println(num1);
            
        }
    }
}

