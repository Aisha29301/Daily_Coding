import java.util.HashMap;
import java.util.Map;

public class LongestSubstrAllUnique {
    public static int longestAllSubstr(String s) {
        int i=0,j=0;
        int max = Integer.MIN_VALUE;
        char[] arr = s.toCharArray();
        Map<Character,Integer> mp = new HashMap<>();
        while(j < arr.length){
            mp.put(arr[j],mp.getOrDefault(arr[j], 0)+1);
            if(mp.size() == j-i+1){
                max = Math.max(max, j-i+1);
                j++;
            }else if(mp.size() < j-i+1){
                while(mp.size() < j-i+1){
                    mp.put(arr[i],mp.get(arr[i])-1);
                    if(mp.get(arr[i]) == 0){
                        mp.remove(arr[i]);
                    }
                    i++;
                }
                if(mp.size() == j-i+1){
                   max = Math.max(max, j-i+1);
                }
                j++;
            }
        }
        return max == Integer.MIN_VALUE ? 0 : max;
    }

    public static void main(String[] args) {
        System.out.println(longestAllSubstr(""));
    }
}
