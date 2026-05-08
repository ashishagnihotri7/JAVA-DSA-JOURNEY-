// QUACTION : count frequency of each character in a string 
public class day28_dsa_string13 {
    public static void main(String[] args) {
        // String str = "hello ";
        // for (int i = 0; i < str.length(); i++) {
        //     int count = 0;
        //    char ch = str.charAt(i);
        //     for (int j = 0; j < str.length(); j++) {
        //         if (str.charAt(j) == ch) {
        //             count++;
        //         }
        //     }
        //     System.out.println("Frequency of '" + ch + "' is: " + count);
        // }
          String str = "hello";
        int[] freq = new int[256];

        // count frequency
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        // print outside loop
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println("Frequency of '" + (char)i + "' is: " + freq[i]);
            }
        }
    }
}
