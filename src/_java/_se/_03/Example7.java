package _java._se._03;

public class Example7 {
    public static void main(String[] args) {
        String str = "Her name is Tamara. Tamara is a good girl.";
        String strReplace = "Sonia";
        String result = str.replaceFirst("Tamara", strReplace);
        System.out.println(result);
    }
}
