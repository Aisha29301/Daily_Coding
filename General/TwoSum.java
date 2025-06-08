import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        // int [] output = new int[2];

        // for(int i=0;i<nums.length;i++){
        //     Solution.helper(i,nums,target);
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i] + nums[j] == target){
        //             output[0] = i;
        //             output[1] = j;
        //         }
        //     }
        // }
        // return output;


        Map<Integer, Integer> map = new HashMap<>();
        // <element,index>
        int[] output = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                output[0] = map.get(complement); //when map contains that key(ele) then we take index(value)
                output[1] = i; //curr ele index is i
                return output;
            }
            map.put(nums[i], i); //at first when element is not present it will insert and
            //  when complement element value matches in hashmap then it will get index of it which is store in hashmap value
        }
        
        return output;
    }
    public static void main(String[] args) {
        //call static two sum method and display result in array
        int a[]= {2,7,11,15};
        int arr[] = new int[a.length];
        arr = twoSum(a,9);
        System.out.println("Result: ");;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
