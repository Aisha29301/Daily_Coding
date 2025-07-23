package Arrays;

public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int[] ans= new int[n];
        int prodl=1;
        int prodr=1;
        for(int i=n-1;i>=0;i--){
            ans[i]=prodr;
            prodr*= nums[i];
        }
        for(int i=0;i<n;i++){
            ans[i]= ans[i]*prodl;
            prodl*= nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int result[] = productExceptSelf(arr);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
