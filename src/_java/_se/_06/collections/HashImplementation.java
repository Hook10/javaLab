package _java._se._06.collections;

import java.util.Hashtable;

public class HashImplementation {
    public static void main(String[] args){
        Hashtable table = new Hashtable();
        table.put(1, "abc");
        table.put("trest2324", "abc");

        System.out.println(table);
        System.out.println("trest2324".hashCode());
    }
}
