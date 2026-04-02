import java.util.*;
public class day3_print_reverse_n_to_1 {
   public static void main(String[]args)
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the number");
       int n = sc.nextInt();
       for (int i = n; i > 0; i--)
       {
            System.out.println("your reverse number is " + i);
        }
   } 
}
