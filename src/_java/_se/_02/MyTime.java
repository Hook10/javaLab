package _java._se._02;

import java.sql.Time;

public class MyTime extends Time {
    public MyTime(long i) {
        super(i);
    }

    public String current() {
        long hours = getHours();
        if (hours >= 4 && hours < 12) return "утро";
        else if ((hours > 12 && hours < 17)) return "день";
        else if (hours >= 17 && hours < 23) return "вечер";
        else return "ночь";
    }

    public static void main(String[] args) {
        MyTime myTime = new MyTime(300000000);
        System.out.println(myTime.current());
    }
}
