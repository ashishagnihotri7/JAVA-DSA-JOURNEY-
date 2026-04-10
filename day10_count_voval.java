// QUACTION : Count vowels in a string using string builder
import java.util.Scanner;
public class day10_count_voval {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(" abcdefgh");
        int count = 0;
        String c = "";
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o') {
                count++;
            }
        }
        // System.out.println("this is count of vowels = " + count);
       /////////////  EAZY METHOD TO REVERSE STRING ////////////////////
        // String str = "hello";
        // String rev = "";

        // for (int i = str.length() - 1; i >= 0; i--) {
        //     rev = rev + str.charAt(i);
        // }

        // System.out.println("Reversed: " + rev);
   
       
     } 
    }

