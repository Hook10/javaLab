package _java._se._01._array;

public class ConvertArray {
    public static void main(String[] args) {
        ColoredPoint[] cpa = new ColoredPoint[10];
        Point[] pa = cpa;
        System.out.println(pa[1] == null);
        try {
            pa[0] = new Point();
        } catch (ArrayStoreException e) {
            System.out.println(e);
        }
    }
}

class Point {
    int x, y;
}

class ColoredPoint extends Point {
    int color;
}
