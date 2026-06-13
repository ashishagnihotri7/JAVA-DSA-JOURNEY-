    //  FIBONACHI SERIOUS USING RECURSION
    public class day39_recursion12 {
        public static int print(int num) {
            if (num <= 1) {
                return num;
            }
            int last = print(num - 1);
            int slast = print(num - 2);
            return last + slast;
    }
    public static void main(String[] args) {
        int num = 4;
        System.out.println(print(num));
    }
}
