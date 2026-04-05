// QUACTION : Find the maximum & minimum number in an array of integers. 

import java.util.Scanner;

public class day6_find_mini_max {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of arry");
        int size = sc.nextInt();
        int number[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("enter number in indexing " +i);
            number[i] = sc.nextInt();
        }
        int max = number[0];
        int mini = number[0];
        for (int i = 0; i < size;i++){
            if (number[i] > max) {
                max = number[i];
                System.out.println("greater number is " + max);
            } else if (number[i] < mini) {
                mini = number[i];
                System.out.println("minimum value is " + mini);
                
            } else {
                System.out.println("invalid number");
            }
        }
    }
}    


            //  NOTE WE CAN ALSO DO WITH 
//             import java.util.*;


// public class Arrays {
//    public static void main(String args[]) {
//       Scanner sc = new Scanner(System.in);
//       int size = sc.nextInt();
//       int numbers[] = new int[size];


//       //input
//       for(int i=0; i<size; i++) {
//           numbers[i] = sc.nextInt();
//       }


//       int max = Integer.MIN_VALUE;
//       int min = Integer.MAX_VALUE;
     
//        for(int i=0; i<numbers.length; i++) {
//            if(numbers[i] < min) {
//                min = numbers[i];
//            }
//            if(numbers[i] > max) {
//                max = numbers[i];
//            }
//        }


//        System.out.println("Largest number is : " + max);
//        System.out.println("Smallest number is : " + min);
      
//    }
// }
