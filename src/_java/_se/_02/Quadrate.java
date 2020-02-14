package _java._se._02;

public class Quadrate implements Square {
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double square(){
        return a*a;
    }
}
