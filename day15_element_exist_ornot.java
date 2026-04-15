// QUACTION : check element is exist or not 
public class day15_element_exist_ornot {
    public static boolean checkExist(int arr[] ,int target){
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int target = 2;
        boolean result = checkExist(arr, target);
        if (result) {
            System.out.println("element exist  " +target);
        }
        if (!result) {
            System.out.println("element not exist");
        }
    }
}
