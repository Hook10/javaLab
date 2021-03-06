package _java._se._06.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class Examp3 {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>();
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Berlin");
        set.add("New York");
        System.out.println(set);

        for (Object element : set) {
            System.out.print(element.toString() + " ");
        }
    }
}
