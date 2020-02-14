package _java._se._02;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] mas = {3, 6, 5, 1, 2, 9, 8};
        Arrays.sort(mas);
        for (int sorted : mas) {
            System.out.println(sorted);
        }
    }
}
