// QUACTION REVERSE STRING 
public class day25_dsa_string11 {

    public static void main(String[] args) {
        String str = "ashish";
        String st = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            st += str.charAt(i);
        }
        System.out.println(st);
    }
}