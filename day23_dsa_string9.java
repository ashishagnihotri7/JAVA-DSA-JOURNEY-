// QUACTION : toggle case lower to upper case and upper to lower case 
public class day23_dsa_string9 {
    public static void main(String[] args) {
        String str = "ashish";
        String st = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                st += (char) (ch - 32);
            } else {
                st += (char) (ch + 32);
            }
        }
        System.out.println(st);
    }
}
