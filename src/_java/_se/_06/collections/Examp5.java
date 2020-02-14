package _java._se._06.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Examp5 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Berlin");
        set.add("New York");
        System.out.println(set);

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

    }
}
