package _java._se._07;

public class ThreadDemo {
    public static void main(String[] args){
        Talk talk = new Talk();
        Thread walk = new Thread(new Walk());
        talk.start();
        walk.start();
    }
}
