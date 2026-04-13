public class day14_move_zero {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 0, 4, 0, 5, 0, 3, 3, 2, 1};

        int j = 0; // non-zero ka position

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        // print array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}