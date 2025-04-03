package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
    }
}
