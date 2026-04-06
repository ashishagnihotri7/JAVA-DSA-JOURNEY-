import java.util.Scanner;

public class day7_2d_find_x {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows and columns:");
        int row = sc.nextInt();
        int coloum = sc.nextInt();

        int number[][] = new int[row][coloum];

        System.out.println("Enter " + (row * coloum) + " elements:");

        // input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < coloum; j++) {
                number[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter value x:");
        int x = sc.nextInt();

        boolean found = false; //  important

        // search
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < coloum; j++) {
                if (number[i][j] == x) {
                    System.out.println("Number found at index (" + i + ", " + j + ")");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Number not found");
        }
    }
}