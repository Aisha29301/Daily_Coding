package StreamAPI;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Start {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        IntStream stream = Arrays.stream(numbers); // Creates an IntStream from an array
        stream.forEach(System.out::print);
        
        Stream<String> stream1 = Stream.of("apple", "banana", "orange"); // Creates a stream from individual values
        System.out.println(stream1.toList());
    }
}
