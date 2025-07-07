import java.util.HashMap;

public class CountAnagrams {
    public static int countAnagram(String str, String pattern) {
        int k = pattern.length(); // window size
        int i = 0, j = 0, ans = 0;

        // Frequency map for pattern
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : pattern.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int count = map.size(); // Unique chars to match

        while (j < str.length()) {

            // Reduce freq of current char
            char endChar = str.charAt(j);
            if (map.containsKey(endChar)) {
                map.put(endChar, map.get(endChar) - 1);
                if (map.get(endChar) == 0) {
                    count--;
                }
            }
            // Expand window
            if (j - i + 1 < k) {
                j++;
                
            // When window size == k
            } else if (j - i + 1 == k) {
                if (count == 0) {
                    ans++;  // Found anagram
                }

                // Restore char going out of window
                char startChar = str.charAt(i);
                if (map.containsKey(startChar)) {
                    map.put(startChar, map.get(startChar) + 1);
                    if (map.get(startChar) == 1) {
                        count++;
                    }
                }

                i++;
                j++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(countAnagram("foropporfdkofr", "for"));
    }
}
