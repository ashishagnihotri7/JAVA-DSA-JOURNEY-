// QUACTION : FIND FIRST AND LAST OCCURENCE  //brute force solution 
public class dsa16_day6_occurence {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 6,3, 8, 8, 8, 7, 8 };
        int target = 8;
        int first =-1;
        int last =-1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == target) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        System.out.println("first occurence at " +first +"second at " + last );
    }
}