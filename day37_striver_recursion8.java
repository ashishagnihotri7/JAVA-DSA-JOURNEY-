// with a peramiterised for addition
public class day37_striver_recursion8 {
    public static int print(int num){
        while (num == 0) {
            return 0;
        }
        return num + print(num - 1);
    }
    public static void main(String[] args) {
        int num = 3;
      System.out.println(print(num));  
        
    }
}
