import java.util.HashMap;

public class LongestSubstrKUnique {
    public static int longestkSubstr(String s, int k) {
        HashMap<Character, Integer> mp = new HashMap<>();
        int maximum = Integer.MIN_VALUE;
        int i = 0, j = 0;
        char[] arr = s.toCharArray();
        while (j < arr.length) {
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
        return (maximum == Integer.MIN_VALUE) ? -1 : maximum;
    }

    public static void main(String[] args) {
        System.out.println(longestkSubstr("aabacebebebe", 3));
    }
}
