public class day36_striver_recursive6 {
    public static void print(int i, int num) {
        if (i < 0) {
            return;
        }
        print(i -1, num);
    System.out.println(i);
}
    public static void main(String[] args) {
        int num = 4;
        print(num, num);

    }
}