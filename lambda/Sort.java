package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        //lambda with comparator (sort a list)
        List<String> names = Arrays.asList("kelly","James","John");
        Collections.sort(names, (a,b) -> b.compareTo(a));
        System.out.println(names);
    }
}
