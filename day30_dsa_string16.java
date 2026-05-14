// QUACTION : to count most frequent character in a string
public class day30_dsa_string16 {

    public static void main(String[] args) {
        String str = "banana";
        int freq[] = new int[256];
        //count frequency 
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }
        //count most frequency character 
        int max = 0;
        String result = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (freq[ch] > max) {
                max = freq[ch];
                result = ch + "";
            }
        }
    System.out.println("Most frequent character is: " + result + " with frequency: " + max);
    }
}