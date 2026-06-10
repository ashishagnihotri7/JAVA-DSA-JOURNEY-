// print sum of n number  with the help of function  for addition
public class day37_striver_recursion7 {
    public static void print(int i , int sum ) {
        while (i < 0) {
            System.out.println(sum);
            return;

        }
    print(i-1, sum +i);
}
    public static void main(String[] args) {
        int num = 10;
        print(num, 0);

    }
}