// QUACTION : give a sorted array and a target element find the index of target element if it is present in array otherwise return the index where it would be if it were inserted in order. //brute force solution
public class day17dsa7_binary {
    public static int findNum(int arr[], int target) {
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
                
            } else if (arr[i] > target) {
                return i;
            }
           
        }
        return arr.length;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3,  5 };
        int target = 2;
        int result = findNum(arr, target);
        System.out.println("index of target element is " + result);
    }
}