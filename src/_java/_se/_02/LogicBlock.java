package _java._se._02;

import java.util.Date;

public class LogicBlock {
    private int x = 89;
    { x = 20;}

    public LogicBlock(){}
    public LogicBlock(int x) {
        this.x = x;
    }
    public int getX(){
        return x;
    }
public static void main(String[] args){
        LogicBlock2 logic = new LogicBlock2(3);
}

}
