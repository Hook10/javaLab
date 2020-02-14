package _java._se._02;

public class SimpleSingletone {
    private static SimpleSingletone instance;

    private SimpleSingletone(){}

    public static SimpleSingletone getInstance(){
        if(null == instance){
            instance = new SimpleSingletone();
        }
        return instance;
    }
}
