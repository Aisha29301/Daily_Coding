package lambda;

import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("kelly","James","John");
        list.forEach(names -> System.out.println("Names: "+ names));
    }
}
