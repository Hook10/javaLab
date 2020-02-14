package _java._se._03;

public class Example1 {
    public static void main(String[] args) {
        char ch = '现'; //Unicode - 73b0;
        String str = new String("现");

        int b = str.getBytes().length;
        System.out.println("String size = " + str.getBytes().length);
        System.out.println(ch);
        System.out.println(str);
    }

}
