//in-place swap sort algorithm
public class FindDuplicate{
    public static int[] findDuplicateMissing(int [] arr){
        int n = arr.length;
        int i=0;
        while(i<n){
            int correctInd = arr[i] - 1;
            if(arr[i] != arr[correctInd]){
                int temp = arr[i];
                arr[i] = arr[correctInd];
                arr[correctInd] = temp;
            }else{
                i++;
            }
        }
        for(int j=0;j<n;j++){
            if(arr[j] != j+1){
                return new int[]{arr[j],j+1};
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,2,7,3};
        int res[] = findDuplicateMissing(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
            // -- element is missing at -- index
        }
    }
}