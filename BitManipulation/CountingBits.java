package BitManipulation;

public class CountingBits {
    public static int[] countBits(int n) {
        int result[] = new int[n+1];
        result[0] = 0;
        for(int i=0;i<=n;i++){
            if(i%2 != 0){
                result[i] = result[i/2] + 1;
            }else{
                result[i] = result[i/2];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int result[] = countBits(2);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
