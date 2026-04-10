import java.util.Scanner;

public class day10_RemoveSpaces {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // Method 1: Using replace()
        String result = str.replace(" ", "");

        System.out.println("Original: " + str);
        System.out.println("Without spaces: " + result);
    }

}
