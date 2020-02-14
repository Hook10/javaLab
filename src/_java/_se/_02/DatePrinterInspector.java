package _java._se._02;

import java.util.Date;

public class DatePrinterInspector{
    public static void main(String[] args){
        DatePrinter dp = new DatePrinter();
        int x = dp.printDate("01.01.2015");
        dp.printDate(new Date());
        dp.printDate(1, 1, 2015 );
    }

}
