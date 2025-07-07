import java.util.HashMap;

public class L930 {
    public  static int numSubarraysWithSum(int[] nums, int goal) {
        int sum = 0, cnt = 0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        mp.put(0,1);
        for(int num: nums){
            sum = sum + num;
            cnt = cnt + mp.getOrDefault(sum-goal,0);
            mp.put(sum, mp.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
    public static void main(String[] args) {
        int arr[] = {1,0,1,0,1};
        int goal = 2;
        System.out.println(numSubarraysWithSum(arr,goal));
    }
}
