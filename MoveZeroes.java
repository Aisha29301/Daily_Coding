public class MoveZeroes {
    public static void moveZeroes(int[] a) {
        int j = -1;

        for(int i=0;i<a.length;i++){
            if(a[i] == 0){
                j = i;
                break;
            }
        }

        if(j!=-1) {
            for(int i=j+1;i<a.length;i++){
                if(a[i] != 0){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    j++;
                }
            }
        }

    }
    public static void main(String[] args) {
        int [] arr ={0,1,0,3,12};
        System.out.println("Array Before moving zeros: ");
        for (int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Array After moving zeros: ");
        moveZeroes(arr);
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
}
