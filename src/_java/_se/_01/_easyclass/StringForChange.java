package _java._se._01._easyclass;

public class StringForChange {
    public static void main(String[] args) {
        String str = "I like ";
        System.out.println("Before: " + str);
        changeString(str);
        System.out.println("After: " + str);
    }

    public static void changeString(String s) {
        System.out.println("        - before change: " + s);
        s = s + " Java.";
        System.out.println("        - after change: " + s);
    }
}
