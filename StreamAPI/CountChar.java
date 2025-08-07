package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountChar {
    public static void main(String[] args) {
        String input = "ilovecoding";
        Map<String, List<String>> map = Arrays.stream(input.split(""))
        .collect(Collectors.groupingBy(Function.identity()));
        System.out.println(map);

        Map<String, Long> collect = Arrays.stream(input.split(""))
        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(collect);

    }
}
