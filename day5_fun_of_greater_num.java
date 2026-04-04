// Quaction a funtion take 2 input and tell which one greater ?;
import java.util.Scanner;

public class day5_fun_of_greater_num {
    public static int greaterFun(int a, int b) {
        if (a > b) {
           return a ;
        } else {
            return b;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
System.out.println("greater " + greaterFun(a, b));

    }
}
