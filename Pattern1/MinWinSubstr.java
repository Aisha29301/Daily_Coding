import java.util.HashMap;

public class MinWinSubstr {
    public static String minWinSubstr(String str,String pattern){
        HashMap<Character,Integer> mp = new HashMap<>();
        int i = 0,j=0;
        int startIndex = 0; //track start of win
        int min = Integer.MAX_VALUE;
        for(char ch : pattern.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch, 0)+1);
        }
        int cnt  = mp.size();
        while(j < str.length()){
            char endChar = str.charAt(j);
            if(mp.containsKey(endChar)){
                mp.put(endChar,mp.get(endChar)-1);
                if(mp.get(endChar) == 0){
                    cnt--;
                } 
            }
            while(cnt == 0){
                if (j - i + 1 < min) {
                min = j-i+1;
                startIndex = i;
                }
                char startChar = str.charAt(i);
                if(mp.containsKey(startChar)){
                    mp.put(startChar,mp.get(startChar)+1);
                    if (mp.get(startChar) > 0) {
                        cnt++;
                    }
                }
                i++;
            }
            j++;
        }
        return min == Integer.MAX_VALUE ? "" : str.substring(startIndex,startIndex+min);
    }
    public static void main(String[] args) {
        String s = "abcttvcoktlntcpockltto";
        String t = "toc";
        System.out.println(minWinSubstr(s, t));
    }

}
