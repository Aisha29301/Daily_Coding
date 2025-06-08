import java.util.Scanner;

public class MissingPositive {
    public static int firstMissing(int[] arr, int n) {
        boolean[] present = new boolean[n + 1];

        // Mark the positive numbers present in the array
        for (int num : arr) {
            if (num > 0 && num <= n) {
                present[num] = true;
            }
        }

        // Find the first missing positive integer
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                return i;
            }
        }

        return n + 1;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int j=0;j<n;j++){
                arr[j] = sc.nextInt();
            }
            System.out.println(firstMissing(arr, n));
        }
        sc.close();
    }
}
