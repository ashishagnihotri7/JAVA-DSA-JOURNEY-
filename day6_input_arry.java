// Quaction: take input with the help of arry and print number 

import java.util.Scanner;

public class day6_input_arry {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
    System.out.println(" enter the  size of an arry = ");
        int marks[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("enter number"+ i);
            marks[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
    System.out.println(marks[i]);
}
    }
}