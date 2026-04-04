// Quaction to calculate an average;
import java.util.Scanner;

public class day5_cal_avg_of_3_with_fun {
    public static int calAvg(int a, int b, int c) {
        
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("cal culate avg =" + calAvg(a, b, c));
    }
}
