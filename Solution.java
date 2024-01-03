import java.util.*;
public class Solution {
    public static int flipBits(int[] arr, int n) {
        int ones = 0;
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                a[i] = -1;
                ones++;
            } else {
                a[i] = 1;
            }
        }

        int maxsum = 0, sum = 0;

        for (int i = 0; i < n; i++) {
            sum += a[i];
            if (sum > maxsum) maxsum = sum;
            if (sum < 0) sum = 0;
        }

        return maxsum + ones;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int t = scanner.nextInt();

        // Process each test case
        for (int i = 0; i < t; i++) {
            // Read the size of the array
            int n = scanner.nextInt();

            // Read the array elements
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }

            // Call the flipBits function and print the result
            int result = flipBits(arr, n);
            System.out.println(result);
        }

        // Close the scanner
        scanner.close();
    }
}
