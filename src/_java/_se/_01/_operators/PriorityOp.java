package _java._se._01._operators;

public class PriorityOp {
    public static void main(String[] args){
        int i = 3;
//        int b = i++ +i++;
//        System.out.println(b);
                i = -i++ + i++ + -i;

        System.out.println(i);

    }
}
