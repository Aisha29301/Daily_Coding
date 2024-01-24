import java.util.HashMap;
import java.util.Map;

public class FindDifference {
    public char findTheDifference(String s, String t) {
        Map<Character,Integer> mp = new HashMap<>();
        for(char ch:s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        for(char ch:t.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)-1);
            if(mp.get(ch) < 0)
                return ch;
        }
        return 'a';
    }
    public static void main(String[] args) {
        FindDifference fd = new FindDifference();
        System.out.println(fd.findTheDifference("abcd", "abcde"));
    }
}
