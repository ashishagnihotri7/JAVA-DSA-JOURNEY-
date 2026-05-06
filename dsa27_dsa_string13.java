// QUACTIONN : find first repeated character in a string
public class dsa27_dsa_string13 {
    public static void main(String[] args) {
        String str = "aabbcdde";
               for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                System.out.println(str.charAt(i));
                break;

            }
        }
        
    }
}
