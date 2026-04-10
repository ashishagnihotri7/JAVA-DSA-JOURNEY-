// Quaction convert to upper case 
import java.util.Scanner;

public class dayuser_to_upper {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        str = str.toUpperCase();   // direct conversion

        System.out.println("Uppercase: " + str);
    }
}