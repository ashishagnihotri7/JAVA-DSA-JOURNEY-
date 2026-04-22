// QUACTION : remove space from string 
public class day23_dsa_string6 {
    public static void main(String[] args) {
        String str = "h e l l o";
        String st ="";
        for(int i =0;i<str.length();i++){
            if(str.charAt(i) != ' '){
                st +=str.charAt(i);
            }
        }
        System.out.println(" after removing " + st);
    }
}
