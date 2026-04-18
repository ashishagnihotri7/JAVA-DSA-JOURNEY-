//QUCTION  : wind occurance and last occurence 
public class day19_re {
    public static int firstOcc(int arr[], int target) {
        int low = 0;
        int ans = -1;
    int high = arr.length - 1;
    int mid = low + (high - low) / 2;
    if (arr[mid] == target) {
        ans = mid;
        high = mid - 1;

    } 
    else if (arr[mid] < target) {
        low = mid + 1;
    } else {
        high = mid - 1;
    }

    return ans;
}
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,5,5,6,7};
        int target = 5;
        int result = firstOcc(arr, target);
        System.out.println("First occurrence of " + target + " is at index: " + result);
    }
}