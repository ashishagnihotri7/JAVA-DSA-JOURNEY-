// QUACTION : find the last accurance of an element in a sorted array using binary search
public class day16_dsa6_find_last_acc {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4,4, 4, 5, 6, 7, 7, };
        int target = 4;
        int ans = -1;
        int low = 0;
        int high = arr.length - 1;
        while (low<=high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                ans = mid;
                low = mid + 1;// to find the last occurrence, we move the low pointer to mid + 1 shift right
            }else if(arr[mid]<target){
                low = mid +1;
            } else {
                high = mid - 1;
            }
            
        }
        System.out.println("last occurrence of " + target + " is at index " + ans);
    }
}
