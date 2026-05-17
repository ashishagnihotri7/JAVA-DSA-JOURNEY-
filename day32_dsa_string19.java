// QUACTION : Sum of Digits in String
public class day32_dsa_string19 {
    public static void main(String[] args) {
        String str = "asdf32";
        int sum = 1;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                sum += (ch - '0'); // Convert character to integer
            }
        }
        System.out.println("Sum of digits in the string: " + sum);
    }
}
