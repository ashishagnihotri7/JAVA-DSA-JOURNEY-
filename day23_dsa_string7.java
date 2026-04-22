// QUACTION : count word in STRING
public class day23_dsa_string7 {
    public static void main(String[] args) {
        String str = "ashish";
        int count = 0;
      
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                
                count++;
            }
        }
        System.out.println("number of char in String is " + count);
    }
}
