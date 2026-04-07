// QUACTION : find second largest number 

import java.util.Scanner;

public class day8_sec_larg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {3, 1, 5, 2};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;  // old largest becomes second
                largest = arr[i];         // new largest
            } 
            else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];   // update second largest
            }
        }

        System.out.println("Second Largest: " + secondLargest);
    }
}
