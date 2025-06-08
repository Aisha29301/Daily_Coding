import java.util.Scanner;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int j = 1;
        // 1 1 2 2 3 3 3
        for(int i=0;i<nums.length-1;i++){

            if(nums[i]!=nums[i+1]){

                nums[j] = nums[i+1];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(removeDuplicates(arr));
        sc.close();
    }
}
