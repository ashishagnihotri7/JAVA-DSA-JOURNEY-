// QUACTION : count vowels and consonants in a string
public class day31_dsa_string17 {
    public static void main(String[] args) {
        int vowelCOunt = 0;
        int consonantCount = 0;
        String str = "hellow world";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                vowelCOunt++;

            } else {
                consonantCount++;
            }
        }
        System.out.println("number of vowels:" + vowelCOunt);
        System.out.println("number of consonants:"+ consonantCount);
    }
}
