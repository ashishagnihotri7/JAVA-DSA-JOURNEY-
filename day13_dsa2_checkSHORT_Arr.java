public class day13_dsa2_checkSHORT_Arr {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                System.out.println("Not Sorted");
                return;
            }
        }

        System.out.println("Sorted");
    }
}