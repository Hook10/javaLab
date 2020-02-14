package _java._se._02;

public class Circle implements Square {
    private int r;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }



    public double square() {
        return r * r * Square.PI;
    }
}
