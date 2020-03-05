package _java._se._06.collections;

import java.util.HashMap;
import java.util.Hashtable;

public class TestHashMap {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        Hashtable table = new Hashtable();
        map.put("1", "abc");
        map.put("2","test");
        table.getOrDefault(1, "defaultValue");

        System.out.println(map.getOrDefault("3", "default"));
        map.put(null, "dasd");
        System.out.println(map.get(null));
    }
}
