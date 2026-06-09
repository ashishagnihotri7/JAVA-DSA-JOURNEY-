//print number from 1 to n
import java.util.*;

public class day36_striver_recursion2 {

    static int count = 0;

    public static void print(int num) {
        if (count == num) {
            return;
        }
        count++;
        System.out.println(count);
        print(num);
    }

    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        print(num);

    }
}
  

 //  with clean code 

// import java.util.*;

// public class day36_striver_recursion2 {

//     public static void print(int i, int n) {

//         if (i > n) {
//             return;
//         }

//         System.out.println(i);

//         print(i + 1, n);
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         print(1, n);
//     }
// }