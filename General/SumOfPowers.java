import java.util.Scanner;

public class SumOfPowers {
    private static long getPoints(long x){
        long count = 0;
        for(long i=2; i*i <= x;i++){
            while(x%i == 0){
                x /= i;
                count++;
            }
        }
        if(x != 1)
            count++;

        return count;
    }
    public static long sumOfPowers(long a, long b){
        long result = 0;
        for(long i=a;i<=b;i++){
            result += getPoints(i);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sumOfPowers(a, b));
        sc.close();
    }
}
