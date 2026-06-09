import java.util.Scanner;

public class day36_striver_recursion3 {
    public static void print(int num) {
        if (num == 0) {
            return;
        }
        System.out.println(num);
        print(num -1 );
    }

    public static void main(String[] args) {
        System.out.println("enter a number ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        print(num);
    }
}