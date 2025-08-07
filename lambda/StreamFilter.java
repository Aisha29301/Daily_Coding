package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 4, 6, 9, 12, 15);
        numbers.stream()
            .filter(n -> n%3 == 0)
            .forEach(n -> System.out.println("Divisible by 3"+ n));

        List<Integer> collect = numbers.stream()
        .filter(n -> n%2 == 0)
        .collect(Collectors.toList());
        System.out.println(collect);
    }
}
