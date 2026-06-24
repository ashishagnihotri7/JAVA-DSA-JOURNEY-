import java.util.*;
public class day41_striver_recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int hash[] = new int[26];
        //frequency count ;
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (hash[i] > 0) {
                System.out.println((char)(i+'a')+"->"+ hash[i]);
            }
        }
    }
}
