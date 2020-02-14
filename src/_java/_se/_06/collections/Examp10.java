package _java._se._06.collections;

import java.util.Deque;
import java.util.LinkedList;

public class Examp10 {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<String>();
        deque.offer("Oklahoma");
        deque.offer("Indiana");
        deque.addFirst("Texas");
        deque.offer("Georgia");
        while (deque.size() > 0)
            System.out.print(deque.remove() + " ");
    }
}
