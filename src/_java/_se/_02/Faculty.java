package _java._se._02;

import java.util.ArrayList;
import java.util.List;

public class Faculty implements Cloneable {
    private String name;
    private int numberDepartments;
    private List<Department> departmentList;

    public Faculty clone() throws CloneNotSupportedException {
        Faculty obj = null;

        obj = (Faculty) super.clone();
        if (null != this.departmentList) {
            ArrayList<Department> tempList = new ArrayList<Department>(this.departmentList.size());
            for (Department listElem : this.departmentList) {
                tempList.add((Department) listElem.clone());
            }
            obj.departmentList = tempList;
        }
        return obj;
    }
}
