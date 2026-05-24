// QUACTION: reverse every char in java 
public class day33_dsa_string21 {
    public static void main(String[] args) {
        String str = "i love you";
        String word = "";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                word = ch + word; // Reverse the characters in the word
            } else {
                result += word + " "; // Add the reversed word to the result
                word = ""; // Reset the word
            }
        }
        result += word; // Add the last reversed word to the result
        System.out.println("Reversed string is: " + result);
    }
}
