// Quaction : optimal solution to find first and last occurence with help of upper and lower bound
public class day16_dsa6_optimal_of_occurence {

    // Lower Bound (>= target)
    public static int lowerBound(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= target) {   //  correct
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    // Upper Bound (> target)
    public static int upperBound(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > target) {   
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 4, 4, 5, 6};
        int target = 4;

        int first = lowerBound(arr, target);
        int last = upperBound(arr, target) - 1;

        if (first == arr.length || arr[first] != target) {
            System.out.println("element not found");
        } else {
            System.out.println("first occurrence: " + first + 
                               " last occurrence: " + last);
        }
    }
}