// QUACTION : we have to find the smallest word in string 
public class day33_dsa_string20 {
    public static void main(String[] args) {
        String str = "i love you";
        String word[] = str.split(" ");
        String smallest = word[0];
        for (int i = 0; i < word.length; i++) {
            if (smallest.length() > word[i].length()) {
                smallest = word[i];
            }
        }
        System.out.println("Smallest word is: " + smallest);
    }
}
