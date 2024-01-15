import java.util.Scanner;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
           return false;
       }

       int original = x;
       int reversed = 0;

       while (x != 0) {
           reversed = reversed * 10 + x % 10;
           x /= 10;
       }

       // If the reversed number is equal to the original, it's a palindrome
       return original == reversed;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));
        sc.close();
    }
}
