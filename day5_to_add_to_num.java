import java.util.Scanner;

public class day5_to_add_to_num {
    public static int addNUmber(int a,int b){
        int sum = a + b;
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = addNUmber(a, b);
        System.out.println(sum);
    }
}
