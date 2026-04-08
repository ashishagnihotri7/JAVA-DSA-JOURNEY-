// QUACTION : Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. use arry
import java.util.Scanner;

public class day8_string_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = sc.nextInt();
        sc.nextLine(); // buffer clear

        String arr[] = new String[size];

        // input
        System.out.println("Enter strings:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextLine();
        }

        // replace e -> i
        for (int i = 0; i < size; i++) {
            arr[i] = arr[i].replace('e', 'i'); //  change here
        }

        // print result
        System.out.println("Updated strings:");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }

        
    }
}



//      // ASLO DO WITH 
// Scanner sc = new Scanner (System.in);
//      String str = sc.next();
//      String result = "";


//      for(int i=0; i<str.length(); i++) {
//        if(str.charAt(i) == 'e') {
//          result += 'i';
//        } else {
//          result += str.charAt(i);
//          System.out.println(result);
//        }
//      }