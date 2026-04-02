import java.util.*;
public class day3_print_the_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number to print table ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i +" = "+ n*i);
        }
    }
}
