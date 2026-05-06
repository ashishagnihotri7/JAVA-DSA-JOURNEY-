// QUACTION : check it is anagram or not 
public class day27_dsa_string12 {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean isAnagram = true;
        if (str1.length() != str2.length()) {
            isAnagram = false;
            return;
        }
        int count[] = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i) - 'a']++;
            count[str2.charAt(i) - 'a']--;
        }
        isAnagram = true;
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                isAnagram = false;
            }
        }
        if (isAnagram) {
            System.out.println("it is anagram");
        }
            else {
                System.out.println("it is not anagram");
            }
    }
}
