package _java._se._01._easyclass;
import java.util.Date;

public class TransferParameter {
    public static void main(String[] args){
        Date myDate = new Date();
        System.out.println("Before:" + myDate.getDate());
        changeDate(myDate);
        System.out.println("After:" + myDate.getDate());
    }
    public static void changeDate(Date date){
        System.out.println("        - before change: " +  date.getDate());
        date.setDate(12);
        System.out.println("        - after change: " + date.getDate());
    }
}
