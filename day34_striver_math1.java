// given a number count the total number of digits in it
import java.util.*;

public class day34_striver_math1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        // int count = 0;
        // while (num > 0) {
        //     num = num / 10;
        //     count++;
        // }
        // System.out.println("count of total number : " + count);

        // same code using log10 
        int count =(int)(Math.log10(num) + 1);
        System.out.println("count of total number : " + count);

    }
}
