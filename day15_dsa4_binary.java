public class day15_dsa4_binary {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8,9,10,56}; // sorted array
        int target = 10;

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                System.out.println("Element found at index " + mid);
                return;
            } 
            else if (arr[mid] < target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        System.out.println("Element not found");
    }
}