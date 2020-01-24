package _java._se._01._operators;
import static java.lang.Math.pow;
import static java.lang.Math.PI;
public class StaticImport {
    private int i = 20;

    public void staticImport(){
        double x;
        x = pow(i, 2) * PI;
        System.out.println("x= " + x);
    }
}
