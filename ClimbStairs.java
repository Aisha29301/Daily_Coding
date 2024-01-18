public class ClimbStairs {
    public static int climbStairs(int n) {
        if (n == 1 || n == 2 || n == 3) {
            return n;
        }

        int a = 1;
        int b = 2;
        int c = 3;

        for (int i = 3; i <= n; i++) {
            c = a + b;

            int tempB = b;
            b = c;
            a = tempB;
        }

        return c;
    }
    public static void main(String[] args) {
        int result = climbStairs(5); 
        System.out.println(result);
    }
}
