import java.util.Scanner;

public class TotalWays {
    public static int totalWays(int N)
    {
        //it's fibonacci series starting from 2 and
        // each number should be multiplied to get for both sides
        long mod = 1000000007L;
        
        long f[] = new long[N + 1];
        f[0] = f[1] = 1;
        
        for (int i = 2; i <= N; i++) {
            f[i] = (f[i - 1] % mod + f[i - 2] % mod) % mod;
        }
        
        long ans = (f[N] + f[N - 1]) % mod;
        ans = (ans * ans) % mod;
        int res = (int)ans;
        return res;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(totalWays(n));
        scanner.close();
    }
}
