import java.util.*;
public class day3_break_in_loop {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for (int i = 1; i <= 5; i++) {
        //     System.out.println(i);
        //     System.out.println("hello");
        //     if (i == 3) {
        //         System.out.println("breaking the loop");
        //         break;
        //     }
        // }
        //    FOR WHILE LOOP 
//         int i = 0;
//         while (i<=5) {
//             System.out.println(i);
//             System.out.println("hello");
//             if (i == 3) {
//                 System.out.println("breaking the loop");
//                 break;
//             }
//             i++;
//         }
// System.out.println("loop ended");

// for do while loop
        int i = 0;
        do {
            System.out.println(i);
            System.out.println("hello");
            if (i == 3) {
                System.out.println("breaking the loop");
                break;
            }
            i++;
        } while (i <= 5);
    }
}