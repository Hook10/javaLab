package _java._se._05;

public class Division {
    public static void main(String[] args) {
        int d;
        int a;
        try {
            d = 0;
            a = 42 / d;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль.");
        }
        System.out.println("Уже после блока try - catch.");
    }
}
