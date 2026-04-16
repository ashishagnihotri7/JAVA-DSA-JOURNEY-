// QUACTION : give a sorted array and a target element find the index of target element if it is present in array otherwise return the index where it would be if it were inserted in order. //optimal solution
public class day17dsa7_optimal {
    public static int fnum(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid =low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int arr[] = { 1,  3, 4 };
        int target = 2;
        int result = fnum(arr, target);
        System.out.println("index of target element is " + result);

    }
}
