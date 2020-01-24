package _java._se._01._beans;

public class BeanArrayExample {
    private double data[];

    public double getData(int index) {
        return data[index];
    }

    public void setDate(int index, double value) {
        data[index] = value;
    }

    public double[] getData() {
        return data;
    }

    public void setDate(double[] values) {
        data = new double[values.length];
        System.arraycopy(values, 0, data, 0, values.length);
    }

}
