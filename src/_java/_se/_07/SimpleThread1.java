package _java._se._07;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleThread1 implements Runnable {
    public int count = 0;
    public void run(){
        for (int i = 0; i < 1000000; i++) {
            count++;
        }
        System.out.println(count);
    }
}

class Solution{
    public static void main(String[] args){
        ExecutorService ex = Executors.newCachedThreadPool();
        ex.execute(new SimpleThread1());
        ex.execute(new SimpleThread1());
        ex.shutdown();
    }
}
