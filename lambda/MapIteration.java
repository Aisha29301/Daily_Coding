package lambda;

import java.util.HashMap;
import java.util.Map;

public class MapIteration {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        map.forEach((k,v) -> System.out.println(k + " = " + v));
    }
}
