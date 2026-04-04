import java.util.Scanner;

public class day5_caluclate_factorial {

    public static int calFacto(int n) {
        if (n < 0) {
            System.out.println("invalid value");
            return -1;
        }

        int facto = 1;

        for (int i = 1; i <= n; i++) {
            facto = facto * i;
        }

        return facto;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int c = calFacto(n);
        System.out.println(c);
    }
}