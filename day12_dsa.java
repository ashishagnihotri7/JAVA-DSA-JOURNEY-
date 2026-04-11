//    FIND MAXIMUM NUMBER //
import java.util.Scanner;
public class day12_dsa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int size = sc.nextInt();
        // System.out.println("arr");
        int arr[] = new int[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("max is " + max);


        
    }
}