// QUACTION : check 1 number occure how many time 
public class day21_dsa9_countoccur {

 public static void main(String[] args) {

        int arr[] = {1, 2, 4, 4, 4, 5, 6};
        int target = 4;

        int n = arr.length;

        // LOWER BOUND
        int low = 0, high = n - 1;
        int first = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= target) {
                first = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        // UPPER BOUND
        low = 0;
        high = n - 1;
        int last = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > target) {
                last = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        // FINAL CHECK
        if (first == n || arr[first] != target) {
            System.out.println("Count: 0");
        } else {
            System.out.println("Count: " + (last - first));
        }
    }
}