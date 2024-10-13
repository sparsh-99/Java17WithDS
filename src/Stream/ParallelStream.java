package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

public class ParallelStream {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Default Parallel Stream: ");
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        list.parallelStream()
                .peek(num -> System.out.println(Thread.currentThread().getName() + " " + num))
                .forEach(num -> {
        });

        System.out.println("Custom Parallel Stream with 4 threads: ");
        // Custom ThreadPool with limited parallel streams
        ForkJoinPool customThreadPool = new ForkJoinPool(4);

        customThreadPool.submit(() -> list.parallelStream()
                .peek(num -> System.out.println(Thread.currentThread().getName() + " " + num))
                .forEach(num -> {
                })).get();
    }
}
