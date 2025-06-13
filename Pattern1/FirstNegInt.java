import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class FirstNegInt {
    static List<Integer> firstNegInt(int arr[], int k) {
        List<Integer> result = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();
        int i=0,j=0;
        while(j<arr.length){
            // Track if needed
            if(arr[j] < 0){
                deque.addLast(arr[j]);
            }
            // Window size < K → just expand
            if(j-i+1 < k){
                j++;
            // Window size == K → process + slide
            }else if(j-i+1 == k){
                if(!deque.isEmpty()){
                    result.add(deque.peekFirst());
                }else{
                    result.add(0);
                }
                if(!deque.isEmpty() && arr[i] == deque.peekFirst()){
                    deque.removeFirst();
                }
                i++;
                j++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {-8, 2, 3, -6, 10};
        int k = 2;
        System.out.println(firstNegInt(arr, k));
    }
}
