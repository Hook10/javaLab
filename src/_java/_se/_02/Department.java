package _java._se._02;

import java.util.Date;

public class Department implements Cloneable {
    private Integer name;
    private Date date = new Date();

    public Department clone() throws CloneNotSupportedException {
        Department obj = null;

        obj = (Department) super.clone();
        if(null != this.date){
            obj.date = (Date) this.date.clone();
        }
        return obj;
    }
}
