package _java._se._01._array;

public class CloneArray {
    public static void main(String[] args) {
        int ia[][] = {{1, 2}, null};
        int ja[][] = (int[][]) ia.clone();
        System.out.println((ia == ja) + "   ");
        System.out.println(ia[0] == ja[0] && ia[1] == ja[1]);
    }
}
