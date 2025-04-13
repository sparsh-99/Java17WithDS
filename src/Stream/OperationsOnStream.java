package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OperationsOnStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Sparsh", "Garg", "Anmol", "Gupta");

        // 1. Filtering
        List<String> filteredName = list.stream().filter(name -> name.startsWith("G")).toList();
        System.out.println("Filtered Names starting with 'G': " + filteredName);

        // 2. Mapping
        List<Integer> nameLengths = list.stream().map(String::length).toList();
        System.out.println("Lengths of names: " + nameLengths);

        // 3. FlatMap -> Flattens multiple lists into a single stream.
        List<List<Integer>> numbers = Arrays.asList(Arrays.asList(1,2,3), Arrays.asList(4,5,6), Arrays.asList(7,8,9));
        List<Integer> flattenedList = numbers.stream().flatMap(List::stream).toList();
        System.out.println("Flattened List: " + flattenedList);

        //4. Distinct -> Returns distinct elements from the stream.
        List<String> distinctNames = list.stream().distinct().toList();
        System.out.println("Distinct Names: " + distinctNames);

        //5. Sorted -> Sorts the elements of the stream.
        List<String> sortedList = list.stream().sorted().toList();
        System.out.println("Sorted List: " + sortedList);

        //6. Limit -> Returns the first n elements from the stream.
        List<String> limitedList = list.stream() .limit(3).toList();
        System.out.println("Limited List: " + limitedList);

        List<String> list1 = Arrays.asList("apple", "banana", "cherry", "apple", "banana", "date", "watermelon");

        List<String> results = list1.stream()
                .filter(s -> s.length() > 5) // keeps only string with length > 5 = "banana", "cherry", "banana", "watermelon"
                .map(String::toUpperCase) // converts to uppercase = "BANANA", "CHERRY", "BANANA", "WATERMELON"
                .flatMap(s -> Stream.of(s.split(""))) // [B, A, N, A, N, A, C, H, E, R, R, Y, B, A, N, A, N, A, W, A, T, E, R, M, E, L, O, N]
                .distinct() // [B, A, N, C, H, E, R, Y, W, T, M, L, O]
                .sorted(Comparator.reverseOrder()) // Sorts characters in reverse lexicographical (alphabetical) order: [Y, W, T, R, O, N, M, L, H, E, C, B, A]
                .limit(10) // [Y, W, T, R, O, N, M, L, H, E]
                .skip(2) // [T, R, O, N, M, L, H, E]
                .peek(System.out::println)
                .toList();
        System.out.println("Results: " + results);
    }
}
