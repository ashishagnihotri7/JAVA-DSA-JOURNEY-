import java.util.Scanner;

public class day3_continue_in_loop {
    public static void main(String[] args) {
        // for (int i = 1; i <= 5; i++) {
        //     if (i == 3) {
        //         System.out.println("skipping 3");
        //         continue; // skip 3
        //     }
        //     System.out.println(i);
        // }
   
        //    FOR WHILE LOOP
        // int i = 1;
        // while (i <= 5) {
        //     System.out.println("hellow");
        //     i++;
        //     if (i == 3) {
        //         System.out.println("skip");
        //         continue;
        //     }
        // }
        //        // for do while
     int i = 1;

        do {
            if (i == 3) {
                i++;          //  important (warna infinite loop)
                continue;     // skip 3
            }

            System.out.println(i);
            i++;

        } while (i <= 5);
   
    }

}


