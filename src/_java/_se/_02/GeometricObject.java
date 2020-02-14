package _java._se._02;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

abstract class GeometricObject {
    public abstract double getArea();
}

class RectangleGO extends GeometricObject {
    private double sideA;
    private double sideB;

    public double getArea() {
        return sideA * sideB;
    }
}

class CircleGO extends GeometricObject {
    private double radius;

    public double getArea() {
        return 2 * 3.14 * radius * radius;
    }
}

class GeometricObjectComparator implements Comparator<GeometricObject> {
    public int compare(GeometricObject o1, GeometricObject o2) {
        double area1 = o1.getArea();
        double area2 = o2.getArea();
        if (area1 < area2) {
            return -1;
        } else if (area1 == area2) {
            return 0;
        } else {
            return 1;
        }
    }
    Comparator<GeometricObject> comparator = new GeometricObjectComparator();
    TreeSet<GeometricObject> met = new TreeSet<GeometricObject>(comparator);
//    met.add(new RectangleGO(4,5));
//    met.add(new CircleGO(40));

}

