package PrefixSum;

public class RangeCovered {
    public static boolean isCovered(int[][] ranges, int left, int right) {
        boolean isCovered = false;
        for (int i = left; i <= right; i++) {
            for (int[] arr : ranges) {
                if (arr[0] <= i && i <= arr[1]) {
                    isCovered = true;
                    break;
                }
            }
            if (!isCovered) 
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        // int[][] ranges = {{1,2},{3,4},{5,6}};
        // int left = 2;
        // int right = 5;
        int[][] ranges = {{1,1}};
        int left = 1;
        int right = 15;
        System.out.println(isCovered(ranges, left, right));
    }
}
