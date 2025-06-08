import java.util.*;
public class FlipBits {
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
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }
            int result = flipBits(arr, n);
            System.out.println(result);
        }
        scanner.close();
    }
}
