package _java._se._02;

public class Pen {
    private int price;
    private String producerName;

    public int hashCode() {
        return (int) (31 * price + ((null == producerName) ? 0 : producerName.hashCode()));
    }
//    public boolean equals(Object obj ){
//        if(this == obj){return true;}
//        if(null == obj){return false;}
//        if(getClass() != obj.getClass()){return false;}
//
//        Pen pen = (Pen)obj;
//        if(price != pen.price){return false;}
//        if(null == producerName){return (producerName == pen.producerName); }
//        else{if(!producerName.equals(pen.producerName)){
//            return false;}}
//        return true;
//        }


}
