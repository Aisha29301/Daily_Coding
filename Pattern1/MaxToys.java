// John is at a toy store help him pick maximum number of toys.
// He can only select in a continuous(substring) manner and he can select only two(2=k) types of toys.
import java.util.HashMap;

public class MaxToys {
    public static int maxToys(int arr[],int k){
        HashMap<Integer, Integer> mp = new HashMap<>();
        int maximum = Integer.MIN_VALUE;
        int i = 0, j = 0;
        while(j < arr.length){
            mp.put(arr[j], mp.getOrDefault(arr[j], 0) + 1);
            if (mp.size() < k) {
                j++;
            } else if (mp.size() == k) {
                maximum = Math.max(maximum, (j - i + 1));
                j++;
            } else if (mp.size() > k) {
                while (mp.size() > k) {
                    mp.put(arr[i], mp.get(arr[i]) - 1);
                    if (mp.get(arr[i]) == 0) {
                        mp.remove(arr[i]);
                    }
                    i++;
                }
                if (mp.size() == k) {
                    maximum = Math.max(maximum, (j - i + 1));
                }
                j++;
            }
        }
        return maximum;
    }

    public static void main(String[] args) {
        // char arr [] = {'a','b','a','c','c','a','b'};
        int arr[] = {1,2,3,2,2};
        System.out.println(maxToys(arr,2));
    }
}
