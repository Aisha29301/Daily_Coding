public class CountPalindromeSubstring {
    static int countSubstring(String str, int left, int right){
        int cnt = 0;
        while(left>=0 && right <str.length() && str.charAt(left) == str.charAt(right)){
            cnt++;
            left--;
            right++;
        }
        return cnt;
    }
    static int countPalindrome(String str){
        int count = 0;
        for(int i=0;i<str.length();i++){
            count+=countSubstring(str,i,i);
            count+=countSubstring(str,i,i+1);
        }
        return count;

    }
    public static void main(String[] args) {
        System.out.println(countPalindrome("abc"));
    }
}