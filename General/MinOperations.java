import java.util.*;

public class MinOperations {
    public static int minOperations(int[] nums) {
        int n = nums.length;

        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }

        int result = 0;

        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            int freq = entry.getValue();

            if (freq == 1) {
                // we can only remove equal elements
                return -1;
            }

            result += Math.ceil((double) freq / 3);
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int result = minOperations(nums);
        System.out.println(result);
        sc.close();
    }
}
