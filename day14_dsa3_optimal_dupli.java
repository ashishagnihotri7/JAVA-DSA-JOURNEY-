public class day14_dsa3_optimal_dupli {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3, 4, 4, 5, 6 };

        int i = 0;

        for (int j = 1; j < arr.length; j++) {   
            if (arr[j] != arr[i]) {              
                i++;
                arr[i] = arr[j];                
            }
        }

        // print
        for (int k = 0; k <= i; k++) {          
            System.out.print(arr[k] + " ");
        }

        System.out.println("\nTotal unique: " + (i + 1));
    }
}