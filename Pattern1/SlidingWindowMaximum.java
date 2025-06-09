import java.util.Deque;
import java.util.LinkedList;

class SlidingWindowMaximum {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length-k+1];
        Deque<Integer> deque = new LinkedList<>();
        int i=0,j=0;
        int t=0;
        while(j < nums.length){
            while(!deque.isEmpty() && deque.peekLast() < nums[j]){
                deque.pollLast();
            }
            deque.addLast(nums[j]);
            if((j-i+1) < k){
                j++;
            }else if((j-i+1) == k){
                result[t] = deque.peekFirst();
                t++;
                if(nums[i] == deque.peekFirst()){
                    deque.pollFirst();
                }
                i++;
                j++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] res = maxSlidingWindow(arr,k);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+ " ");
        }
    }
}
