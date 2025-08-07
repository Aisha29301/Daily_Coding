import java.util.ArrayList;

public class FruitOfBasket2 {
    public static int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        ArrayList<Integer> basket = new ArrayList<>();
        for(int i:baskets){
            basket.add(i);
        }
        for(int i=0;i<fruits.length;i++){
            for(int j=0;j<basket.size();j++){
                if(basket.get(j)>=fruits[i]){
                    basket.remove(j);
                    break;
                }
            }
        }
        return basket.size();
    }
    public static void main(String[] args) {
        int fruits[] ={4,2,5};
        int baskets[] = {3,5,4};
        System.out.println(numOfUnplacedFruits(fruits, baskets));
    }
}
