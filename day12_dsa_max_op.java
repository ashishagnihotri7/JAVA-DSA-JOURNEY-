import java.util.Scanner;

public class day12_dsa_max_op {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("enter array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < size; i++) {

            // SECOND MAX
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] < max && arr[i] > secondMax) {
                secondMax = arr[i];
            }

            // SECOND MIN
            if (arr[i] < min) {
                secondMin = min;
                min = arr[i];
            } else if (arr[i] > min && arr[i] < secondMin) {
                secondMin = arr[i];
            }
        }

        System.out.println("Second Max: " + secondMax);
        System.out.println("Second Min: " + secondMin);
    }
}