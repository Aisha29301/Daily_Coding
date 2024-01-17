import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class UniqueOccurences {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Store frequency of each number
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        
        HashSet<Integer> set = new HashSet<>();
        
        for (int freq : map.values()) {
            if (set.contains(freq)) {
                return false;
            }
            set.add(freq);
        }
        
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //create array and accept from user n and elements of array
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(uniqueOccurrences(arr));
        sc.close();

    }
}
