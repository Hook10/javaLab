package _java._se._02;

public class Point2D {
    private int x;
    private int y;
    public Point2D(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Point2D(int size){
        this(size, size);
    }
}
