// Quaction: take an innput from user and find the number x also print its index 

import java.util.Scanner;

public class day6_find_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size ");
        int size = sc.nextInt();
        int number[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("enter number at index " + i);
            number[i] = sc.nextInt();
        }
System.out.println("enter number x ");
int x = sc.nextInt();
for (int i = 0; i < number.length; i++) {
    if (x == number[i]) {
        System.out.println("index  " +i);
    }
}
    }
}
