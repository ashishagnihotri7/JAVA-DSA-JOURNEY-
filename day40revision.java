
public class day40revision {

    public static void main(String[] args) {
        int n = 5678;
        int n1 = n;
        int add = 0;
        while(n>0){
            int last = n % 10;
            System.out.println(last);
            n = n / 10;
            add++;
        }
        System.out.println(n1);

    }
}