package StreamAPI;

import java.util.stream.Collectors;

public class DuplicateChar {
    // Remove duplicates from a string
    public static void main(String[] args) {
        String input = "ilovecoding";
        String result = input.chars()
                            .distinct()
                            .mapToObj(c -> String.valueOf((char) c))
                            .collect(Collectors.joining());
        System.out.println(result);
    }
}
