package _java._se._03;

import javax.print.attribute.standard.MediaSize;

public class Example5 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new StringBuffer("He").append("llo").toString();
        String s3 = s2.intern();
        System.out.println("s1 == s2? " + (s1 == s2));
        System.out.println("s2 == s3? " + (s1 == s3));
        String hello = "Hello", lo = "lo";
        System.out.println((hello == "hello") + " ");

        System.out.println((hello == ("Hel" + "lo")) + " ");
        System.out.println((hello == ("Hel" + lo)) + " ");
        System.out.println(hello == ("Hel" + lo).intern());
    }

}
