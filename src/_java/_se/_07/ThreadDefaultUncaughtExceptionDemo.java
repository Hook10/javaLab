package _java._se._07;

public class ThreadDefaultUncaughtExceptionDemo {
    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler(
                new Thread.UncaughtExceptionHandler() {
                    public void uncaughtException(Thread t, Throwable e) {
                        System.out.println(t + " (default handler) throws exception: " + e);
                    }
                });
        Thread t1 = new Thread(new MyThread1());
        Thread t2 = new Thread(new MyThread1());

        t2.setUncaughtExceptionHandler(
                new Thread.UncaughtExceptionHandler() {
                    public void uncaughtException(Thread t, Throwable e) {
                        System.out.println(t + " throws exception: " + e);
                    }
                }
        );
        t1.start();
        t2.start();
    }
}
class MyThread1 implements Runnable {
    public void run() {
        throw new RuntimeException();
    }
}
