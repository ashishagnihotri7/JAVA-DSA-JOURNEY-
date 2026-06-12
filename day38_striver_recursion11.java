public class day38_striver_recursion11 {

    public static void print(int[] arr, int start, int n) {
        if (start >= n / 2) {
            return;
        }

        int temp = arr[start];
        arr[start] = arr[n - start - 1];
        arr[n - start - 1] = temp;

        print(arr, start + 1, n);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;

        print(arr, 0, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}