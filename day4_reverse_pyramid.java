// Quaction : print reverse pyramid

import java.util.Scanner;
public class day4_reverse_pyramid {
    public static void main(String[] args) {
        int n = 4;
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.err.print("*");
            }
        System.out.println();
        }
    }
}
