package org.example.springfeatures.future;

import org.junit.jupiter.api.Test;

import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PracticeFutureTests {

    /**
     * Observe that the get method throws some checked exceptions and InterruptedException
     * @throws InterruptedException (an exception signifying that a thread was interrupted either before or during an activity)
     * @throws ExecutionException (encapsulating an exception that occurred during a computation)
     */
    @Test
    public void test() throws InterruptedException, ExecutionException {
        Future<String> completableFuture = calculateAsync4();

        String result = completableFuture.get();
        assertEquals("Hello World!", result);
    }

    /**
     * We have a method that creates a CompletableFuture instance,
     * then spins off some computation in another thread and returns the Future immediately.
     */
    public Future<String> calculateAsync() throws InterruptedException {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();

        try (ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor()) {
            executorService.submit(() -> {
                Thread.sleep(5_000);
                completableFuture.complete("Hello");
                return null;
            });
        }
        Thread.startVirtualThread(() -> completableFuture.complete("Hello World!"));

        return completableFuture;
    }

    /**
     * If we already know the result of a computation, we can use the static completedFuture method with an argument that represents the result of this computation.
     * Consequently, the get method of the Future will never block, immediately returning this result instead
     */
    public Future<String> calculateAsync2() throws InterruptedException {
        return CompletableFuture.completedFuture("Hello World!");
    }

    /**
     * What if we want to skip this boilerplate and execute some code asynchronously?
     * Static methods runAsync and supplyAsync allow us to create a CompletableFuture instance out of Runnable and Supplier functional types correspondingly.
     * The Runnable interface is the same old interface used in threads and does not allow to return a value.
     * The Supplier interface is a generic functional interface with a single method that has no arguments and returns a value of a parameterized type.
     */
    public Future<String> calculateAsync3() throws InterruptedException {
        return CompletableFuture.supplyAsync(() -> "Hello World!");
    }

    /**
     * Processing Results of Asynchronous Computations: The thenApply method does exactly that;
     */
    public Future<String> calculateAsync4() throws InterruptedException {
        // The thenAccept method receives a Consumer and passes it the result of the computation. Then the final future.get() call returns an instance of the Void type
        CompletableFuture.supplyAsync(() -> "Hello")
                .thenAccept(s -> System.out.println("Hello World!"));
        // If we neither need the value of the computation nor want to return some value at the end of the chain, then we can pass a Runnable lambda to the thenRun method.
        CompletableFuture.supplyAsync(() -> "Hello")
                .thenRun(() -> System.out.println("Computation Finished!"));
        // It accepts a Function instance, uses it to process the result, and returns a Future that holds a value returned by a function.
        return CompletableFuture.supplyAsync(() -> "Hello")
                .thenApply(s -> s + " World!");
    }

    /**
     * Combine CompletableFuture instances in a chain of computation steps:
     * The result of this chaining is itself a CompletableFuture that allows further chaining and combining.
     */
    @Test
    public void combineInChain() throws InterruptedException, ExecutionException {
        // A simple case is when we want to do something with two Futures‘ results but don’t need to pass any resulting value down a Future chain.
        CompletableFuture.supplyAsync(() -> "Hello")
                .thenAcceptBoth(CompletableFuture.supplyAsync(() -> " World!"), (s1, s2) -> System.out.println(s1 + s2));

        // Use the thenCompose method to chain two Futures sequentially.
        Future<String> future = CompletableFuture.supplyAsync(() -> "Hello")
                .thenCompose(s -> CompletableFuture.supplyAsync(() -> s + " World!"));
        assertEquals("Hello World!", future.get());
        // ⚠️ Differences between thenApply() and thenCompose() is analogous to the difference between map() and flatMap().

        // If we want to execute two independent Futures and do something with their results, we can use the thenCombine method
        future = CompletableFuture.supplyAsync(() -> "Hello")
                .thenCombine(CompletableFuture.supplyAsync(() -> " World!"), (s1, s2) -> s1 + s2);
        assertEquals("Hello World!", future.get());
    }

    /**
     * The CompletableFuture.allOf static method allows to wait for the completion of all the Futures provided
     */
    @Test
    public void multipleFuturesInParallel() throws InterruptedException, ExecutionException {
        CompletableFuture<String> future1  = CompletableFuture.supplyAsync(() -> "Hello");
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> "Beautiful");
        CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> "World");

        CompletableFuture<Void> combinedFuture = CompletableFuture.allOf(future1, future2, future3);
        // Notice that the return type of the CompletableFuture.allOf() is a CompletableFuture<Void>.
        // The limitation of this method is that it does not return the combined results of all Futures.
        combinedFuture.get();

        assertTrue(future1.isDone());
        assertTrue(future2.isDone());
        assertTrue(future3.isDone());

        // Fortunately, CompletableFuture.join() method and Java 8 Streams API makes it simple:
        String combined = Stream.of(future1, future2, future3)
                .map(CompletableFuture::join)
                .collect(Collectors.joining(" "));

        assertEquals("Hello Beautiful World", combined);
    }
}
