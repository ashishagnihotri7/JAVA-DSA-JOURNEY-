import java.util.Scanner;

public class day3_print_even_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("give any number to print even number");
        int num = sc.nextInt();
       
        for (int i =1 ;i<=num;i++){
            if (i%2==0){
                System.out.println("even number is " +i);
            }
        }

        }
    }
