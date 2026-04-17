// Floor = largest element jo target se chhota ya equal ho (≤ target)
public class day18_dsa_floor {
    public static int fnum(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (+high - low) / 2;
            if (arr[mid] <= target) {
                System.out.println("your target elment is " + target);
                ans = arr[mid];
                low = mid + 1;
            } 
          else {
                high = mid - 1;
        }

        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 4 };
        int target = 2;
        int result = fnum(arr, target);
        System.out.println("Floor of target element is: " + result);
        if(result != -1){
            System.out.println("Floor of target element is: " + result);
        }
        else{
            System.out.println("No floor element found for the target.");
        }

    }
}