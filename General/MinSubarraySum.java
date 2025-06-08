import java.util.ArrayList;
import java.util.Scanner;

public class MinSubarraySum {
    public static int minSubarraySum(ArrayList<Integer> arr, int n, int k) {
        // using sliding window algorithm
        int currWinSum = 0;
        // sum of first k elements
        for (int i = 0; i < k; i++) {
            currWinSum += arr.get(i);
        }
        int minSum = currWinSum;
        int minLastIndex = k - 1;
        for (int i = k; i < n; i++) {
            currWinSum += arr.get(i);
            currWinSum -= arr.get(i - k);
            if (currWinSum < minSum) {
                minSum = currWinSum;
                minLastIndex = i;
            }
        }
        int endIndex = minLastIndex;
        int startIndex = minLastIndex - k + 1;
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.println(arr.get(i));
        }
        return minSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        int result = minSubarraySum(arr, n, k);
        System.out.println(result);
        sc.close();
    }
}
