package Multithreading;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SharedResource {
//    private int counter = 0;

//    public synchronized void increment() {
//        counter++;
//    }

//    private Lock lock = new ReentrantLock();
//    public void increment() {
//        lock.lock();
//        try {
//            counter++;
//        } finally {
//            lock.unlock();
//        }
//    }

    private AtomicInteger counter = new AtomicInteger(0);
    public void increment() {
        counter.incrementAndGet();
    }

    public int getCounter() {
        return counter.get();
    }
}

public class RaceConditionSynchronized {
    public static void main(String[] args) throws InterruptedException {
        SharedResource sharedResource = new SharedResource();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i <= 1000; i++) {
                sharedResource.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i <= 1000; i++) {
                sharedResource.increment();
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Final counter value: " + sharedResource.getCounter());
    }
}
