package _java._se._06.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Examp4 {
    public static void main(String[] args){
        Set<String> set = new HashSet<String>();
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Berlin");
        set.add("New York");

        TreeSet<String> treeSet = new TreeSet<String>(set);
        System.out.println(treeSet);
        for(Object element : set){
            System.out.print(element.toString() + " ");
        }
    }
}
