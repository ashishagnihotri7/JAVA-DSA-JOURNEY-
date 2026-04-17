// QUACTION : Ceil Value Ceil = smallest element jo target se bada ya equal ho (≥ target)
public class day18_dsa8Ceil {
    public static int cnum(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                high = mid - 1;
            
            } else {  
                low = mid + 1;
            } 
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = { 1,  3, 4, 5, 5 };
        int target = 2;
        int result = cnum(arr, target);
        if (result != -1) {
            System.out.println("Ceil of target element is: " + result);
        }
    }
}
