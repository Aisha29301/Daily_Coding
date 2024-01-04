import java.util.Scanner;

public class StringPalindrome {
    public static boolean isAlphanumeric(char ch) {
		return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9');
	}
	public static boolean checkPalindrome(String str) {
		int start = 0, end = str.length() - 1;

		while (start <= end) {
			while (start <= end && !isAlphanumeric(str.charAt(start)))
				start++;

			while (start <= end && !isAlphanumeric(str.charAt(end)))
				end--;

			if (start <= end && Character.toLowerCase(str.charAt(start)) != Character.toLowerCase(str.charAt(end)))
				return false;

			start++;
			end--;
		}

		return true;
	    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++) {
            String str = sc.next();
            if(checkPalindrome(str)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
		sc.close();

    }
}
