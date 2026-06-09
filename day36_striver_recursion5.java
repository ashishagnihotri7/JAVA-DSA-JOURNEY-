// print 1 to n but by back treacking
public class day36_striver_recursion5 {
    public static void print(int i, int num) {
        if (i>num) {
            return;
        }
        print(i+1 , num);
        System.out.println(i);
    }
    public static void main(String[] args) {
        int num = 10;
        print(1, num);
    }
}
