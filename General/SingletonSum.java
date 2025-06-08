import java.util.Scanner;

public class SingletonSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum = getDigitSum(num);
        System.out.println("The single digit sum is: " + sum);
        sc.close();
    }

    public static int getDigitSum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum < 10 ? sum : getDigitSum(sum);
    }
}
