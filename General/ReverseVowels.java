import java.util.Scanner;

public class ReverseVowels {
    private static boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) >= 0;
    }
    public static String reverseVowels(String s) {
        int n = s.length();
        char[] chars = s.toCharArray();
        int i = 0;
        int j = n-1;
        while(i<j){
            if( ! isVowel(chars[i]))  i++;
            else if( ! isVowel(chars[j])) j--;
            else // both are vowels
            {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++; j--;
            }
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(reverseVowels(str));
        sc.close();
    }
}
