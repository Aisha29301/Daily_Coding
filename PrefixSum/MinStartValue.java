package PrefixSum;

public class MinStartValue {
    public static int minStartValue(int[] nums) {
        int sum = 0;
        int minsum = 0;
        for(int i=0;i<nums.length-1;i++){
            sum += nums[i];
            minsum = Math.min(sum,minsum);
        }
        return 1-minsum;

    }
    public static void main(String[] args) {
        int [] nums = {-3,2,-3,4,2};
        System.out.println(minStartValue(nums));
    }
}
