//prinit from n  to 1  USING BSCK TRACKING
public class day36_striver_recursion4 {
    public static void f(int i, int num) {
        if (i<1) {
            return;
        }
        System.out.println(i);
        f(i - 1, num);
    }
    

    public static void main(String[] args) {
        int num = 6;
        f(num, num);
    }
}
