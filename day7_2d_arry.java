// QUACTION to take in put in i and j and print output ( 2D arry )

import java.util.Scanner;

public class day7_2d_arry {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int coloum = sc.nextInt();

        int number[][] = new int[row][coloum];

        // Input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < coloum; j++) {
                number[i][j] = sc.nextInt();
            }
        }

        // Output
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < coloum; j++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}