package _java._se._02.paramClasses;

public class Optional<T> {
    private T value;

    public Optional() {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T val) {
        value = val;
    }

    public String toString() {
        if (value == null) return null;
        return value.getClass().getName() + " " + value;
    }

    public static void main(String[] args) {
        Optional<Integer> ob1 = new Optional<Integer>();
        ob1.setValue(1);
        int v1 = ob1.getValue();

        Optional<String> ob2 = new Optional<String>();
        String v2 = ob2.getValue();

        Optional ob3 = new Optional();
        ob3.setValue("Java SE 6");
        ob3.setValue(71);
        ob3.setValue(null);
    }



}
