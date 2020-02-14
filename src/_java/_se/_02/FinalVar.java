package _java._se._02;

import java.util.Date;

public class FinalVar {
    private final int finalVar = 23134;
    public static final int staticFinalVar = 1234;
    private final Date date;

    public void method(final int var) {
        final int temp = 12;
    }

    public FinalVar() {
        date = new Date();
    }

//    public static final int staticFinalVar;
//
//    static{
//        staticFinalVar = 2134123412;
//    }

}
