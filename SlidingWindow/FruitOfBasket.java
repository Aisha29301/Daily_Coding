import java.util.HashMap;

public class FruitOfBasket {
    public static int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int i = 0, j = 0;
        int k = 2;
        int maximum = 0;
        while(j < fruits.length){
            mp.put(fruits[j],mp.getOrDefault(fruits[j],0)+1);
                while(mp.size() > k){
                    mp.put(fruits[i],mp.get(fruits[i])-1);
                    if(mp.get(fruits[i]) == 0){
                        mp.remove(fruits[i]);
                    }
                    i++;
                }          
            maximum = Math.max((j-i+1),maximum);
            j++;
        }
        return maximum;
    }
    public static void main(String[] args) {
        int arr [] = {1,2,2};
        System.out.println(totalFruit(arr));
    }
}
