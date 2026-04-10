import java.util.Scanner;
public class day10_COUNt_word_in_sen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter string");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int count = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != ' ' && (i == 0 || sb.charAt(i - 1) == ' ')) {
                count++;
            }
        }
System.out.println("total word " + count);
    }
}