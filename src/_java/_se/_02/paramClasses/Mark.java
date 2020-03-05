package _java._se._02.paramClasses;

public class Mark<T extends Number> {
    public T mark;

    public Mark(T value) {
        mark = value;
    }

    public T getMark() {
        return mark;
    }

    public int roundMark() {
        return Math.round(mark.floatValue());
    }

    public boolean sameAny(Mark<?> ob) {
        return roundMark() == ob.roundMark();
    }

    public boolean same(Mark<T> ob) {
        return getMark() == ob.getMark();
    }

    public static void main(String[] args) {
        Mark<Double> md = new Mark<Double>(71.4D);
        System.out.println(md.sameAny(md));

        Mark<Integer> mi = new Mark<Integer>(71);
        System.out.println(md.sameAny(mi));

        System.out.println(md.roundMark());
    }
}
