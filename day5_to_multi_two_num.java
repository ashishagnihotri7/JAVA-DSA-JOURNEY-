// Quaction to calculate multiplay of 2 int variable;
import java.util.Scanner;
public class day5_to_multi_two_num {
    public static int multifun(int a, int b) {
        
        return a * b;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println("multiplay"+multifun(a, b));
    }
}