package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {
        // Stream from a collection
        List<String> list = Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J");
        Stream<String> stream1 = list.stream();

        // Stream from an array
        String[] arr = {"one", "two", "three", "four", "five"};
        Stream<String> stream2 = Arrays.stream(arr);

        // Stream using stream.of()
        Stream<Integer> stream3 = Stream.of(1, 2, 3, 4, 5);

        // Stream from a generator
        Stream<Integer> stream4 = Stream.generate(() -> 1);

        // Stream from a range
        IntStream intStream = IntStream.range(1, 5);  // 1,2,3,4
        LongStream longStream = LongStream.rangeClosed(1, 5);  // 1,2,3,4,5
    }
}
