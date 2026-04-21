// QUACTION reverse string 
public class day22_dsa_string2 {
    public static void main(String[] args) {
        String str = "hello world";
        for(int i=str.length()-1;i>=0;i--) {
            System.out.print(str.charAt(i));
        }
    }
}
