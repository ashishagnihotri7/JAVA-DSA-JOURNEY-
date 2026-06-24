import java.util.Scanner;

public class day41_striver_rerecurtion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] hash = new int[13];

        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        // Print all frequencies
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > 0) {
                System.out.println(i + " -> " + hash[i]);
            }
        }
    }
}