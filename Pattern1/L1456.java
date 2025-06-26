public class L1456 {
    private static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            return true;
        return false;
    }
    public static int maxVowels(String s, int k) {
        int max = Integer.MIN_VALUE;
        int i=0,j=0;
        int vcnt = 0;
        char [] arr = s.toCharArray();
        while(j < arr.length){
            if(isVowel(arr[j])){
                vcnt++;
            }
            max = Math.max(max,vcnt);
            if(j-i+1 < k){
                j++;
            }
            else if(j-i+1 == k){
                max = Math.max(max,vcnt);
                if(isVowel(arr[i])){
                    vcnt--;
                }
                i++;
                j++;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        System.out.println(maxVowels(s, k));

    }
}
