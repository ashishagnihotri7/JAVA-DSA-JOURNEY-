// QUACTION : COUNT  STEP TO  FIND NUMBER 
     public class day15BinarySearchCountSteps {

        public static int countSteps(int arr[], int target) {
            int low = 0;
            int high = arr.length - 1;
            int steps = 0;

            while (low <= high) {
                steps++; // har iteration = 1 step

                int mid = low + (high - low) / 2; // optimal

                if (arr[mid] == target) {
                    System.out.println("element found at " + mid);
                    return steps; // mil gaya
                } else if (arr[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            return steps; // agar element nahi mila
        }

        public static void main(String[] args) {
            int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
            int target = 4;

            int result = countSteps(arr, target);
            System.out.println("Steps taken: " + result);
        }
    }
