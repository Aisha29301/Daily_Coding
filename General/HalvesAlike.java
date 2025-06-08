import java.util.Scanner;

public class HalvesAlike {
    public static boolean isVowel(char c){
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || 
        c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }
    public static boolean halvesAreAlike(String s) {
        int n = s.length();
        int mid = n/2;

        int i = 0, j = mid;
        int countl = 0, countr= 0;

        while(i < mid  &&  j < n){
            if(isVowel(s.charAt(i))) countl++;
            if(isVowel(s.charAt(j))) countr++;
            i++;j++;
        }
        return countl == countr;
    }
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(halvesAreAlike(str)); 
        sc.close();
    }
}
