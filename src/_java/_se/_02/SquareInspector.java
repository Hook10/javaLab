package _java._se._02;

public class SquareInspector {
    public static void main(String[] args) {
        Quadrate box = new Quadrate();
        box.setA(4);
        Rectangle rectangle = new Rectangle();
        rectangle.setA(2);
        rectangle.setB(3);
        Circle circle = new Circle();
        circle.setR(3);

        System.out.println("Box: " + box.square());
        System.out.println("Rect.: " + rectangle.square());
        System.out.println("Circle: " + circle.square());

    }
}
