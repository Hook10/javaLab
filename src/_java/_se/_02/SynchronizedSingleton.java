package _java._se._02;

public class SynchronizedSingleton {
    private static SynchronizedSingleton instance;

    private SynchronizedSingleton() {
    }

    public static synchronized SynchronizedSingleton getInstance() {
        if (null == getInstance()) {
            instance = new SynchronizedSingleton();
        }
        return instance;
    }
}
