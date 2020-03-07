package _java._se._07;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicThread {
    public static AtomicInteger count = new AtomicInteger(0);

    public void run() {
        for (int i = 0; i < 10000000; i++) {
            count.getAndAdd(1);
        }
        System.out.println(count);
    }
}
