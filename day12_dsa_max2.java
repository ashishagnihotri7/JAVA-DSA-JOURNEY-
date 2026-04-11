//  FIND SECOND LARGEST NUMBER   //better solution 
import java.util.Scanner;

public class day12_dsa_max2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int size = sc.nextInt();
        System.out.println("enter arry ");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

        }
        int largest = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        int mini = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] > mini && arr[i] != largest) {
                mini = arr[i];
            }

        }
        System.out.println("second largest number is "+ mini);
    }
}
