// QUACTION : count word in string 
public class day32_dsa_string17 {
    public static void main(String[] args) {
        String str = "i love you";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ' && i != str.length()-1) {
                count++;
            }
        }
        System.out.println("Number of words in the string: " + (count + 1));
    }
}
