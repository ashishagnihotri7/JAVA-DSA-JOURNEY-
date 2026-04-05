// Quaction Take an array of names as input from the user and print them on the screen.

import java.util.Scanner;

public class day6_Aeey_take_name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of arry");
        int size = sc.nextInt();
        String name[] = new String[size];
        for (int i = 0; i < size; i++) {
           System.out.println("enter name " + (i + 1));
            name[i] = sc.next();
        
}
for (int i = 0;i<name.length;i++){
    System.out.println("name  "+(i+1)+ " is "+ name[i]);
}
        
    }
}
