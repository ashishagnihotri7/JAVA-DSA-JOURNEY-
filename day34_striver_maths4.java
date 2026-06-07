// QUACTION IS AMSTRONG NUMBER OR NOT MEANING THE SUM OF THE CUBE OF THE DIGIT IS EQUAL TO THE NUMBER OR NOT
public class day34_striver_maths4 {
    public static void main(String[] args) {
        int num = 371;
        int temp = num ;
        int sum =0;
        while (num > 0) {
            int last = num % 10;
            sum = sum + (last*last*last);
            num = num / 10;
        }
        if (temp == sum) {
            System.out.println("the number is armstrong");
        } else {
            System.out.println("the number is not armstrong");
        }
    }
}
