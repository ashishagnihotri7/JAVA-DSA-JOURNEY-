import java.util.*;
public class day34_striver_math {
    public static void main(String[] args) {
        // QUACTION IS TO REVERSE THE NUMBER 
        int num = 7789;
        while (num > 0) {
            int lastdigit = num % 10;
            
            System.out.println(lastdigit);
            num = num / 10;
        }
    
    }
}
