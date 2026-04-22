// remove duplicate
public class practice_quaction_only {

    public static void main(String[] args) {
        String str = "ashissh";
        String st = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (st.indexOf(ch) == -1) {
                st += ch;
            }
        }
        System.out.println(st);
        }
}