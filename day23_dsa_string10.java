// QUACTION remove duplicate 
public class day23_dsa_string10 {
    public static void main(String[] args) {
    String str = "programmioing";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }

        System.out.println(result);
    }
}