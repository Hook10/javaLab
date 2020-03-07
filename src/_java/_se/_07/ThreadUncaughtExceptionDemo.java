package _java._se._07;

public class ThreadUncaughtExceptionDemo {
    public static void main(String[] args) {
        Thread t = new Thread(new SimpleThread1());
        t.setUncaughtExceptionHandler(
                new Thread.UncaughtExceptionHandler() {
                    public void uncaughtException(Thread t, Throwable e) {
                        System.out.println(t + " throws exception: " + e);
                    }
                });
        t.start();
    }
}

class SimpleThread implements Runnable {
    public void run() {
        throw new RuntimeException("It is a create exception");
    }
}

