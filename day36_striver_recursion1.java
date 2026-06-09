//print 5 timease name with recursion relation 
import java.util.*;

public class day36_striver_recursion1 {
    static int num = 0;
    
    public static void print() {
        if(num==5){
            return;
        }
        System.out.println("ashish");
        num++;
        print();
    }
    public static void main(String[] args) {
        print();
    }
}
