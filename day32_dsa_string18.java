// QUACTION : find duplicte character in string
public class day32_dsa_string18 {
    public static void main(String[] args) {
        String str = "programming";
        int count[] = new int[256]; // Assuming ASCII character set
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            count[ch]++;

        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (count[ch] > 1) {
                System.out.println("Duplicate character: " + ch + ", Count: " + count[ch]);
                count[ch] = 0; // To avoid printing the same character multiple times
}
        }
    }
}
