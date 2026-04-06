import java.util.Scanner;

public class day7_2d_print_spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        // Taking input for matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Spiral Order Matrix:");

        int strow = 0;
        int enrow = n - 1;
        int stcol = 0;
        int encol = m - 1;

        // Spiral traversal
        while (strow <= enrow && stcol <= encol) {

            // 1. Top Row
            for (int col = stcol; col <= encol; col++) {
                System.out.print(matrix[strow][col] + " ");
            }
            strow++;

            // 2. Right Column
            for (int row = strow; row <= enrow; row++) {
                System.out.print(matrix[row][encol] + " ");
            }
            encol--;

            // 3. Bottom Row
            if (strow <= enrow) {
                for (int col = encol; col >= stcol; col--) {
                    System.out.print(matrix[enrow][col] + " ");
                }
                enrow--;
            }

            // 4. Left Column
            if (stcol <= encol) {
                for (int row = enrow; row >= strow; row--) {
                    System.out.print(matrix[row][stcol] + " ");
                }
                stcol++;
            }
        }

        sc.close();
    }
}