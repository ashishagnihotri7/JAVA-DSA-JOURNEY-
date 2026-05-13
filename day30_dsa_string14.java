// QUACTION : COunt digit,alphabet,special character in a string 
import java.util.Scanner;
public class day30_dsa_string14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        int digitCount = 0;
        int alphabetCount = 0;
        int specialCharCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                alphabetCount++;
            } else if (ch >= '0' && ch <= '9') {
                digitCount++;
            } else {
                specialCharCount++;
        }
        }
        System.out.println("number of AlphabetCount: " + alphabetCount);
        System.out.println("number of DigitCount: " + digitCount);
        System.out.println("number of SpecialCharacterCount: " + specialCharCount);
    }
}
     