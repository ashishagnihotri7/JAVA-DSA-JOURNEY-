// QUACTION : find the largest element in String 
public class day30_dsa_string15 {
    public static void main(String[] args) {
        String str = "hellow iiiiiiiii";
        String largest = "";
        String word[] = str.split(" ");
        for (int i = 0; i < word.length; i++) {
            if(word[i].length() > largest.length()) {
                largest = word[i];
            }
        }
        System.out.println("Largest word: " + largest);
    }
}
