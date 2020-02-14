package _java._se._02;

public class Salary {
    private double baseSalary;
    public static double increaseCoeffitient = 1.5d;

    public Salary(double baseSalary) {
    }

    public double calcSalary() {
        return baseSalary * increaseCoeffitient;
    }
}

