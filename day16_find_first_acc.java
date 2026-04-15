// QUACTION : find the first accurance of an element in a sorted array using binary search
public class day16_find_first_acc {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 4, 4, 5, 6, 7, 7 };
        int target = 4;
        int low = 0;
        int ans = -1;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                ans = mid;
                high = mid -1;  // to find the first occurrence, we move the high pointer to mid - 1
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("first occurrence of " + target + " is at index " + ans);
    }
}
