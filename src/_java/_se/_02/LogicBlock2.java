package _java._se._02;

import java.util.Date;

public class LogicBlock2{
    { System.out.println("logic (1) id = " + this.id);}
    private int id = 7;
    {System.out.println("logic (2) id=" + id);
    Date d = new Date(); calc(d);
    }
    public LogicBlock2(int d ){
        id = d;
        System.out.println("конструктор id=" + id);
    }
    {id = 10;
    System.out.println("logic (3) id=" + id);}
    private void calc(Date d ){
        System.out.println(d.getTime());
    }
}
