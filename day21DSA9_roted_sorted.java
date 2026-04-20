//QUACTION SEARCH IN ROTED SORTED ARRAY // IN THIS HALF PARTED IS SHORTED
public class day21DSA9_roted_sorted {
public static int fNum(int arr[],int target){
    int low = 0;
    int hight = arr.length - 1;
    int ans = -1;
    while (low <= hight) {
        int mid = low + (hight - low) / 2;
        if (arr[mid] == target) {
            return mid;

        }//for right shorted arr 
        if (arr[low] <= arr[mid]) {
            if (target >= arr[low] && target < arr[mid]) {
                hight = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        // for left shorted arr 
        if (arr[mid] <= arr[hight]) {
            if (arr[mid] < target && arr[hight] >= target) {
                low = mid + 1;

            } else {
                hight = mid - 1;
            }
        }

    }
    return -1;
}
    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };

        int target = 5;
        int result = fNum(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}