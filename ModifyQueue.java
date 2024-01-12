import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class ModifyQueue {
    public static Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // we can use stack as well but last test case is TLE so, vector or array is used instead
        // which temporarily store the first 'k' elements
        Vector<Integer> vec = new Vector<>();

        // Calculate the number of elements remaining in the queue after moving 'k' elements
        int remaining = q.size() - k;

        // Move the first 'k' elements from the front of the queue to the vector
        while(k>0){
            vec.add(q.peek());
            q.remove();
            k--;
        }
         
        Collections.reverse(vec);  // Reverse the vector
        
        for(int i=0;i<vec.size();i++){
            q.add(vec.get(i));
        }
        
        // Move the remaining elements to the end of the queue
        while(remaining >0){
            q.add(q.peek());
            q.remove();
            remaining --;
        }
        return q;
    }
    public static void main(String[] args) {
        // Create a sample queue
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        // Print the original queue
        System.out.println("Original Queue: " + queue);

        // Modify the queue by moving the first 2 elements to the end
        Queue<Integer> modifiedQueue = ModifyQueue.modifyQueue(queue, 2);

        // Print the modified queue
        System.out.println("Modified Queue: " + modifiedQueue);
    }
}
