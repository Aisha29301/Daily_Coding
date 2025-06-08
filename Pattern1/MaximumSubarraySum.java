class MaximumSubarraySum {
    public static int maximumSubarraySum(int[] nums, int k) {
        int sum = 0;
        int n = nums.length;
        int j = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            while(j < n){
                sum = sum + nums[j];
                if(j-i+1<k){
                    j++;
                }else if(j-i+1 == k){
                    sum = sum - nums[i];
                    i++;
                    j++;
                    maxSum = Math.max(maxSum,sum);
                }
                
            }
        }
        return maxSum;
    }
    public static void main(String[] args){
        int [] nums = {1,5,4,2,9,9,9};
        int k = 3;
        System.out.println(maximumSubarraySum(nums, k));
    }
}