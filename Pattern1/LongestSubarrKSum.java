public class LongestSubarrKSum {
    //size of longest subarray having sum k
    public static int longestSubarrKSum(int [] arr,int k){
        int sum = 0;
        int i=0,j=0;
        int maximum = Integer.MIN_VALUE;
        while(j < arr.length){
            sum = sum + arr[j];
            if(sum < k){
                j++;
            }else if(sum == k){
                maximum = Math.max(maximum,j-i+1);
                sum = sum - arr[i];
                i++;
                j++;
            }
           
        }
        return maximum;
    }
    public static void main(String[] args) {
        int arr [] = {4,1,1,1,2,3,5};
        int k = 5;
        System.out.println(longestSubarrKSum(arr, k));
    }
}
