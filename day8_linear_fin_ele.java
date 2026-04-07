// QUACTION : with the help of linear search find tRGET  element 
import java.util.Scanner;
public class day8_linear_fin_ele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = { 1, 2, 3, 4, 5, };
        int target = 4;
        boolean flag = false;
        for (int i = 0; i <= a.length; i++) {
            if (target == a[i]) {
                System.out.println("element found  at index " + i);
                flag = true;
                break;
            
            }
        }
        if (flag == false) {
    System.out.println("element not found ");
  }  }
}
